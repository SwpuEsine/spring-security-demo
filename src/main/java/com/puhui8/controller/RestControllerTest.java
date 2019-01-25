package com.puhui8.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.puhui8.entity.User;
import com.puhui8.exception.CustomException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 测试
 *
 * @author
 * @create 2018-11-27 下午3:09
 **/
@RestController
public class RestControllerTest {
    @GetMapping(value = "/hello")
    public String helloWorld(){
        //@RequestParam 如果没有REQUIRE  就必须传入  否则报错
        //如果没有配置模板   那么就会返回一个字符串
        return "hello";
    }


    /*@GetMapping(value = "/user/{id}")   //可以使用正则表达式 这个过滤了注册fuck
    public String getUserById(@PathVariable @ApiParam(value = "用户id") String id){
        System.out.println(id);
        return "success";
    }*/

    /**
     * 使用JSON VIEW
     * 1  定义接口
     * 作用  返回同一个对象的时候  但是返回不同的视图
     */

    @GetMapping(value = "/user/detail")
    @JsonView(User.UserDetailView.class)
    public User getUserDetail(){
        User user=new User();
        user.setPassWord("123456");
        user.setUserName("esine");
        return user;
    }


    @GetMapping(value = "/user/info")
    @JsonView(User.UserSimpleView.class)
    @ApiOperation(value = "我是方法描述")
    public User getUserInfo(){
        User user=new User();
        user.setPassWord("123456");
        user.setUserName("esine");
        return user;
    }

    //后台传JSON 则使用requestBody   前后台分离设计  后台给前台只传递时间戳
    @PostMapping(value = "/user")
    public String addUser(@RequestBody User user){
        return "success";
    }

    /**
     * 参数校验技巧  NOTNULL技巧   不为空 这样可以不用写StringUtil.isNotNUll   不会进入方法体
     * 如果有错 不符合 那么消息就会 传入到ERRORS里面去   日期格式到处理  只传入时间戳
     */

    @PostMapping(value = "/user/blank")
    public String addUserNotBlank(@RequestBody  @Valid User user, BindingResult errors){
        //spring Data JPA  来进行数据库开发  可以用hibernate的注解来进行处理 函数和方法
        if (errors.hasErrors()){
            errors.getAllErrors().stream().forEach(err-> System.out.println(err.getDefaultMessage()));
        }
        System.out.println(user);
        return "success";
    }

    /**
     *  spring boot 在同一个error请求的时候 可以返回不同的结果   可以根据PRODUCE的请求头来判断是返回HTML还是JSON
     *  BasicErrorController  客户端和浏览器 分开处理 默认
     *
     *  通常状况下 spring boot下的 客户端的异常处理足以满足日常需求
     *
     *
     *
     */
    @GetMapping(value = "/user/error")
    public String error(){
        throw  new CustomException("自定义异常");
    }

}

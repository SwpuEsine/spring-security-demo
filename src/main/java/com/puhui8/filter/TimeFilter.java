/*
package com.puhui8.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*/
/**
 * 记录耗时
 *
 * @author
 * @create 2018-11-27 下午5:54
 **//*

public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器开始");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        Long startTime=System.currentTimeMillis();
        filterChain.doFilter(request,response);
        Long endTime=System.currentTimeMillis();
        System.out.println("过滤器结束");
        System.out.println("耗时"+(endTime-startTime)/1000+"秒");
    }

    @Override
    public void destroy() {

    }
}
*/

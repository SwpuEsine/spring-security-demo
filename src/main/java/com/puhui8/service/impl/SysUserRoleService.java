package com.puhui8.service.impl;

import com.puhui8.entity.SysUserRole;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.puhui8.dao.SysUserRoleDao;

@Service
public class SysUserRoleService{

    @Resource
    private SysUserRoleDao sysUserRoleDao;

    public int insert(SysUserRole pojo){
        return sysUserRoleDao.insert(pojo);
    }

    public int insertSelective(SysUserRole pojo){
        return sysUserRoleDao.insertSelective(pojo);
    }

    public int insertList(List<SysUserRole> pojos){
        return sysUserRoleDao.insertList(pojos);
    }

    public int update(SysUserRole pojo){
        return sysUserRoleDao.update(pojo);
    }
}

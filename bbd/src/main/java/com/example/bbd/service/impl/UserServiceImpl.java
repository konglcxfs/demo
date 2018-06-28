package com.example.bbd.service.impl;

import com.example.bbd.service.UserService;
import com.example.dao.user.entity.SysUser;
import com.example.dao.user.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findUsersByUserName(String userName) {
        SysUser sysUser = new SysUser();
        sysUser.setUserName(userName);
        return sysUserMapper.select(sysUser);
    }
}

package com.example.bbd.service;

import com.example.dao.user.entity.SysUser;

import java.util.List;

public interface UserService {

    /**
     * 根据用户名称获取用户列表
     * @param userName
     * @return
     */
    public List<SysUser> findUsersByUserName(String userName);


}

package com.example.bbd.controller;

import com.example.bbd.service.UserService;
import com.example.dao.user.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息控制类
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{userName}")
    public List<SysUser> queryUsers(@PathVariable("userName") String userName){
        return userService.findUsersByUserName(userName);
    }


}

package com.springboot.event.controller;

import com.springboot.event.pojo.UserBean;
import com.springboot.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 16:11
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/register")
    public String register(String name,String password){

        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);

        userService.register(userBean);

        return "success";
    }
}

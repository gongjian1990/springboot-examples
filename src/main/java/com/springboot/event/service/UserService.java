package com.springboot.event.service;

import com.springboot.event.event.UserRegisterEvent;
import com.springboot.event.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 16:08
 **/
@Service
public class UserService {

    @Autowired
    ApplicationContext context;

    public void register(UserBean user){
        context.publishEvent(new UserRegisterEvent(this,user));
    }

}

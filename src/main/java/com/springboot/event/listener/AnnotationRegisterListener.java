package com.springboot.event.listener;

import com.springboot.event.event.UserRegisterEvent;
import com.springboot.event.pojo.UserBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AnnotationRegisterListener
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 16:14
 **/
@Component
public class AnnotationRegisterListener {

    @EventListener
    public void registerListener(UserRegisterEvent event){
        UserBean userBean = event.getUserBean();

        System.out.println("注册信息： "+ userBean.getName() + ": "+ userBean.getPassword());
    }
}

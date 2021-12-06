package com.springboot.event.listener;

import com.springboot.event.event.UserRegisterEvent;
import com.springboot.event.pojo.UserBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName: RegisterUserEmailListener
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 18:19
 **/
@Component
@Slf4j
@Async
public class RegisterUserEmailListener {

    @EventListener
    public void sendEmail(UserRegisterEvent event){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        UserBean userBean = event.getUserBean();
        log.info("发送邮件： ==================，to: {}",userBean.getName());
    }
}

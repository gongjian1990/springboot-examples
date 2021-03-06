package com.springboot.event.listener;

import com.springboot.event.event.UserRegisterEvent;
import com.springboot.event.pojo.UserBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AnnotationRegisterListener
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 16:14
 **/
@Component
@Slf4j
@Async
public class AnnotationRegisterListener {

    @EventListener
    public void registerListener(UserRegisterEvent event){
        UserBean userBean = event.getUserBean();

        log.info("系统进行注册：注册信息：name: {}, password: {}",userBean.getName(),userBean.getPassword());

    }
}

package com.springboot.event.listener2;

import com.springboot.event.event.UserRegisterEvent;
import com.springboot.event.pojo.UserBean;
import com.springboot.event.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CreateAccountListener
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 18:39
 **/

@Component
@Slf4j
public class CreateAccountListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        // 只有是用户注事件才返回true
        return eventType== UserRegisterEvent.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        UserRegisterEvent userRegisterEvent = (UserRegisterEvent) event;
        UserBean userBean = userRegisterEvent.getUserBean();
        log.info("create account : {}",userBean.getName());
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        // 只响应userservice 发布的事件
        return sourceType == UserService.class;
    }

    // 执行顺序，返回值越小，优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}

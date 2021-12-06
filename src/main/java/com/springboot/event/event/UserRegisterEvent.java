package com.springboot.event.event;

import com.springboot.event.pojo.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: UserRegisterEvent
 * @Description:
 * @Author: 龚剑
 * @Date: 2021/12/6 16:04
 **/

@Getter
public class UserRegisterEvent extends ApplicationEvent {

    private UserBean userBean;

    public UserRegisterEvent(Object source,UserBean userBean) {
        super(source);
        this.userBean = userBean;
    }
}

package com.gyx.event.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/7/29
 */
@Getter
public class EmailEvent extends ApplicationEvent {
    private String emailAddress;
    public EmailEvent(Object source,String address) {
        super(source);
        emailAddress = address;
    }

    public boolean sendEmail(){
        System.out.println("邮件发送！");
        return true;
    }
}

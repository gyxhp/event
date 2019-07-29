package com.gyx.listener;


import com.gyx.event.EmailEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/7/29
 */
@Component
public class EventListener {

    @org.springframework.context.event.EventListener
    @Async
    public boolean register(EmailEvent emailEvent){
        emailEvent.sendEmail();
        System.out.println("邮件发送成功！");
        return true;
    }
}

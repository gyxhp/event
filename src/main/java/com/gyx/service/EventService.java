package com.gyx.service;

import com.gyx.event.EmailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/7/29
 */
@Service
public class EventService {
    @Autowired
    ApplicationContext applicationContext;

    public void register(){
        applicationContext.publishEvent(new EmailEvent(this,"gyxhp@foxmail.com"));
    }

}

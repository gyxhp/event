package com.gyx.event.controller;

import com.gyx.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/7/29
 */
@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(value = {"do"})
    public String doSomething(){
        eventService.register();
        return "true";
    }


}

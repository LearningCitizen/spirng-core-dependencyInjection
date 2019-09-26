package com.learningcitizen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {

    MessageService service;

    @Autowired
    public void setService(MessageService service)
    {
        this.service = service;
    }

    public void sendMessage(String msg, String rec)
    {
        this.service.sendMessage(msg, rec);
    }
}

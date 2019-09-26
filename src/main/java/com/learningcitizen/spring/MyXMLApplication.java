package com.learningcitizen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //this class will be scaned as a component
public class MyXMLApplication {

    @Autowired //autowired is required
    MessageService service;

    public void setService(MessageService service)
    {
        this.service = service;
    }

    public void sendMessage(String msg, String rec)
    {
        this.service.sendMessage(msg, rec);
    }
}

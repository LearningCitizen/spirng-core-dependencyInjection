package com.learningcitizen.spring;

public class MyApplication {

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

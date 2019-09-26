package com.learningcitizen.spring;

public class EmailService implements MessageService {

    public boolean sendMessage (String msg, String rec)
    {
        System.out.println("send email : "+msg+" to: "+rec);
        return true;
    }
}

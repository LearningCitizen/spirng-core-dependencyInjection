package com.learningcitizen.spring;

public class TwitterService {
    public boolean sendMessage (String msg, String rec)
    {
        System.out.println("send twitt : "+msg+" to: "+rec);
        return true;
    }
}

package com.learningcitizen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("current directory : " + new File(".").getAbsolutePath());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);
        app.sendMessage("Hello World, it's LearningCitizen with XML injection", "world@gamil.com");
    }
}
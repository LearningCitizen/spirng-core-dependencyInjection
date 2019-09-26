package com.learningcitizen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.sendMessage("Hello World, it's LearningCitizen ", "world@gamil.com");

        MyApplication app2 = new MyApplication();
        //should create and catch a Exception
        try {
            app2.sendMessage("Hello World, it's not LearningCitizen ", "world@gamil.com");
        }
        catch(Exception e){
            System.out.println("Can not inject without Spring configuration ==> "+e);;
        }
        //close the context
        context.close();
    }
}

package com.learningcitizen.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this class is a configuration class
@ComponentScan //indicate to scna components
public class DIConfiguration {

        @Bean //this method will be used to get the bean
        public MessageService getMessageService(){
            return new EmailService();
        }
}

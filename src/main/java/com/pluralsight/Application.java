package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    private static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        logger.log(Level.INFO, speakerService.findAll().get(0).getFirstName());
    }
}

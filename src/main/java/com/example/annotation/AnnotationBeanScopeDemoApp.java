package com.example.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoah = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = theCoah == alphaCoach;
        log.info("Pointing to the same object : " + result);
        log.info("Memory location for theCoach : " + theCoah);
        log.info("Memory location for alphaCoach : " + alphaCoach);

        context.close();
    }
}

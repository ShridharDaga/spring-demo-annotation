package com.example.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        log.info("Workout Details : " +theCoach.getDailyWorkout());
        log.info("Fortune Details : " +theCoach.getDailyFortune());

        context.close();
    }
}

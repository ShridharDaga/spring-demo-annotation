package com.example.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class JavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        log.info("Workout Details : " +theCoach.getDailyWorkout());
        log.info("Fortune Details : " +theCoach.getDailyFortune());

        context.close();
    }
}

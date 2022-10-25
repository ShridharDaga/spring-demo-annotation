package com.example.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        log.info("Workout Details : " +theCoach.getDailyWorkout());
        log.info("Fortune Details : " +theCoach.getDailyFortune());
        log.info("Email : "+ theCoach.getEmail());
        log.info("Team : " + theCoach.getTeam());

        context.close();
    }
}

package com.example.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
@Slf4j
public class TennisCoach implements Coach{

    @Autowired // Field Injection
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


/** Constructor Injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        log.info("tennisCoach : in constructor");
        this.fortuneService = fortuneService;
    }
**/
    public String getDailyWorkout() {
        return "Practice your backhand";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /** @Autowired // Setter Injection
    public void setFortuneService(FortuneService fortuneService) {
        log.info("tennisCoach : in setFortuneService method");
        this.fortuneService = fortuneService;
    }
    **/

    /** @Autowired // Setter Injection with different method name
    public void randomMethod(FortuneService fortuneService) {
        log.info("tennisCoach : in randomMethod method");
        this.fortuneService = fortuneService;
    } **/

    @PostConstruct
    public void doMyStatupStuff(){
        log.info("TennisCoach : in doMyStatupStuff method");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        log.info("TennisCoach : in doMyCleanupStuff method");
    }
}

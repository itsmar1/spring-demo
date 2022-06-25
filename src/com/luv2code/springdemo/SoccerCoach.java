package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score 3 goals";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Score 3 goals";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

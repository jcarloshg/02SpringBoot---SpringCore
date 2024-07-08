package com.springbootscore.springcore.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("SwimCoach" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 100 meters, please. 🏊";
    }

}

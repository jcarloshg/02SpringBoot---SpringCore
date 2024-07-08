package com.springbootscore.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor of: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "He will sleep for 15 minutes. >:)";
    }

}

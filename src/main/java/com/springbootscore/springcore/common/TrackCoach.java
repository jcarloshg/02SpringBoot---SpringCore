package com.springbootscore.springcore.common;

import org.springframework.stereotype.Component;

@Component
// @Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor of: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "This is the daily of TrackCoach ⏩";
    }

}

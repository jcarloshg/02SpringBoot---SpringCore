package com.springbootscore.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "This is daily of Tennis Coach 🥎";
    }

}

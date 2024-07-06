package com.springbootscore.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "This is the daily of BaseBall coach. ⚾";
    }

}

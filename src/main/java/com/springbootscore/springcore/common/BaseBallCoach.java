package com.springbootscore.springcore.common;

import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseBallCoach implements Coach {

    public BaseBallCoach() {
        System.out.println("In constructor of: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "This is the daily of BaseBall coach. ⚾";
    }

}

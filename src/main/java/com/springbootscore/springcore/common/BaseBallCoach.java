package com.springbootscore.springcore.common;

import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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

    // ============================================================
    // >>> NOTE
    // Post construct && Pre Destroy
    // ============================================================

    @PostConstruct
    public String postConstruct() {
        System.out.println("[@PostConstruct] -> postConstruct");
        return "postConstruct";
    }

    @PreDestroy
    public String preDestroy() {
        System.out.println("[@PreDestroy] -> PreDestroy");
        return "PreDestroy";
    }

}

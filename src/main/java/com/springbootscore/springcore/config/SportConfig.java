package com.springbootscore.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootscore.springcore.common.Coach;
import com.springbootscore.springcore.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach () {
       return new SwimCoach();
    }

}

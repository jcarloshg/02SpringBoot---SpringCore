package com.springbootscore.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootscore.springcore.common.Coach;

@RestController
public class DemoController {

    private Coach coach;

    @Autowired
    public DemoController(Coach newCoach) {
        coach = newCoach;
    }

    @GetMapping("/getDaily")
    public String getDaString() {
        return coach.getDailyWorkOut();
    }

}

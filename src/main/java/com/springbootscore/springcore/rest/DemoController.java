package com.springbootscore.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootscore.springcore.common.Coach;

@RestController
public class DemoController {

    private Coach coach;

    // ============================================================
    // >>> NOTE
    // @Qualifier notation has a higher level than @Primary notation
    // ============================================================
    // @Autowired
    // public DemoController(@Qualifier("baseBall") Coach newCoach) {
    //     coach = newCoach;
    // }
    @Autowired
    public DemoController(Coach newCoach) {
        coach = newCoach;
    }

    // ============================================================
    // >>> NOTE
    // To any method, you could put <<@Autowired>>
    // ============================================================
    // @Autowired
    // public void doAnything(Coach newCoach) {
    // coach = newCoach;
    // }

    @GetMapping("/getDaily")
    public String getDaString() {
        return coach.getDailyWorkOut();
    }

}

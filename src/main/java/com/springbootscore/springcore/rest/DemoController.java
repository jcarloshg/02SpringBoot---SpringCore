package com.springbootscore.springcore.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootscore.springcore.common.Coach;

@RestController
public class DemoController {

    private Coach coach;
    // private Coach coach02;

    // ============================================================
    // >>> NOTE
    // @Qualifier notation has a higher level than @Primary notation
    // ============================================================
    // @Autowired
    // public DemoController(@Qualifier("baseBallCoach") Coach newCoach) {
    // System.out.println("In constructor of: " + getClass().getSimpleName());
    // coach = newCoach;
    // }
    // @Autowired
    // public DemoController(Coach newCoach) {
    // coach = newCoach;
    // }

    // ============================================================
    // >>> NOTE
    // By defect, singleton is used, so, <<newCoach>>, <<newCoach02>>
    // will have the same instance.
    // ============================================================
    // @Autowired
    // public DemoController(
    // @Qualifier("baseBallCoach") Coach newCoach,
    // @Qualifier("baseBallCoach") Coach newCoach02) {
    // System.out.println("In constructor of: " + getClass().getSimpleName());
    // coach = newCoach;
    // coach02 = newCoach02;
    // }

    // @GetMapping("/check")
    // public String areTheSame() {
    // // return "Are the same instances: " + coach.equals(coach02);
    // return "Are the same instances: " + (coach == coach02);
    // }

    // ============================================================
    // >>> NOTE
    // To any method, you could put <<@Autowired>>
    // ============================================================
    // @Autowired
    // public void doAnything(Coach newCoach) {
    // coach = newCoach;
    // }

    // ============================================================
    // >>> NOTE
    // Configuration
    // ============================================================
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach newCoach) {
        System.out.println("In constructor of: " + getClass().getSimpleName());
        coach = newCoach;
    }

    @GetMapping("/getDaily")
    public String getDaString() {
        return coach.getDailyWorkOut();
    }

}

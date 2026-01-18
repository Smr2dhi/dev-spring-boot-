package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Daily practice to run!!";
    }
}

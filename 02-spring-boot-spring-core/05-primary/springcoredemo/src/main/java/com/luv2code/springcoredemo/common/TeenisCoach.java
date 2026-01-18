package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class TeenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice your tennis daily";
    }
}

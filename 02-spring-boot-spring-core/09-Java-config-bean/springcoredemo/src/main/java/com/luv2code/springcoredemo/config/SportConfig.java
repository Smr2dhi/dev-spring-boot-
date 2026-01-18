package com.luv2code.springcoredemo.config;


import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //we can also use id here for @bean("Sam")
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}

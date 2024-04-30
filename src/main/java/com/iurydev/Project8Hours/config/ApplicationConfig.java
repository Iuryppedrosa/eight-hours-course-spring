package com.iurydev.Project8Hours.config;

import com.iurydev.Project8Hours.entities.MyFirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev")
public class ApplicationConfig {

    @Bean()
    @Primary
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
  //  @Primary
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }
}

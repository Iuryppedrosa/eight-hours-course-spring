package com.iurydev.Project8Hours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project8HoursApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(Project8HoursApplication.class, args);

		MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.hello());
	}
}

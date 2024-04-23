package com.iurydev.Project8Hours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project8HoursApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(Project8HoursApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAsStory());
		System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustomPropertyInt());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());
	}
}

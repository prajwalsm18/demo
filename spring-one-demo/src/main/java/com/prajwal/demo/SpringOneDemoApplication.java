package com.prajwal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prajwal.demo.springdemo.BaseballCoach;
import com.prajwal.demo.springdemo.Coach;

@SpringBootApplication
public class SpringOneDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOneDemoApplication.class, args);
		
		/*
		 * Coach theCoach = new TrackCoach();
		 * System.out.println(theCoach.getDailyWorkout());
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}

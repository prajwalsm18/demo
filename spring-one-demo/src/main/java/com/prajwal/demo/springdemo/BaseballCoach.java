package com.prajwal.demo.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes not batting practice";
	}
	
}

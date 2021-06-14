package com.prajwal.demo;

import com.prajwal.demo.springdemo.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

}

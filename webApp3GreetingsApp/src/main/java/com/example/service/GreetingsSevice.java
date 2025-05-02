package com.example.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsSevice implements iGreetingService {

	@Autowired
	private LocalTime time;
	
	@Override
	public String greeting(String name) {
		// TODO Auto-generated method stub
		int hour=time.getHour();
		if(hour<12) 
			return "Good Morning "+name;
		else if(hour>12)
			return "Good Afternoon "+name;
		else if(hour<8)
			return "Good evening "+name;
		else
			return "Good Night "+name;
		
		
	}

}

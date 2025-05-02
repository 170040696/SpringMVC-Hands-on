package com.example.configuration;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConfig {
	
	@Bean
	public LocalTime generateTime() {
		return LocalTime.now();
	}

}

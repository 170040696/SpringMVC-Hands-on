package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.iGreetingService;

@Controller
public class GreetingsContoller {

	@Autowired
	private iGreetingService igreetingservice;
	
	@GetMapping("/greeting")
	public String generateWish(Model model) {
		model.addAttribute("greet", igreetingservice.greeting("Akanksha"));
		return "greet";
	}
} 

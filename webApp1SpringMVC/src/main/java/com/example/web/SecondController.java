package com.example.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/Controller2")
public class SecondController {
//
//	@GetMapping("/welcome")
//	public String displaySomeInfo(Model model) {
//		model.addAttribute("message", "Akanksha Cont2 info is learning springboot");
//		return "index"; 
//	}
	
	@GetMapping("/info")
	public String displaySomeInfo(Map<String, Object>map) {
		//model.addAttribute("message", "Akanksha Cont2 info is learning springboot");
		map.put("focus", "Focus is most important skill");
		return "focus"; 
	}
	
	@GetMapping("/home")
	public void displaySomehome(Map<String, Object>map) {
		//model.addAttribute("message", "Akanksha Cont2 info is learning springboot");
		map.put("focus", "Focus is most important skill");
		return ; 
	}
}

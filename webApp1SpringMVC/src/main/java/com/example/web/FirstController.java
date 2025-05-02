package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/Controller1")
public class FirstController {

	@GetMapping("/welcome")
	public String displaySomeInfo(Model model) {
		model.addAttribute("message", "Akanksha Cont 1 is learning springboot");
		return "index"; 
	}
}

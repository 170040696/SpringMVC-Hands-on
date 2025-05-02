package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView displaySomeInfo() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","Hellow welcome to our first application");
		mv.setViewName("index");
		return mv; 
	}
}

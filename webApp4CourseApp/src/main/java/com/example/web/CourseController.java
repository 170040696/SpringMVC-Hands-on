package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Course;

@Controller
public class CourseController {

	@GetMapping("/courseinfo")
	public String CourseInfo(Model model) {
		model.addAttribute("cid", "Telusko");
		model.addAttribute("Cname", "Java");
		model.addAttribute("Ccost", 500);
		return "course";
	}
	
	@GetMapping("/courseinfo1")
	public String CourseDetails(Model model) {
		Course c=new Course();
		c.setCourseId("T1");
		c.setCourseName("Java");
		c.setCoursePrice(500);
		model.addAttribute("course", c);
		return "Courseinfo";
	}
}

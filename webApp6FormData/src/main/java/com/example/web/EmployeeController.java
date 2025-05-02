package com.example.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String getHomePage() {
	return "register";	
	}
	
	@PostMapping("/registration")
	public String SaveEmployees(Map<String, Object>map, Employee emp) {
		
		map.put("emp", emp);
		
		return "response";		
	}

}

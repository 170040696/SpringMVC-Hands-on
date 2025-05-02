package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

	@GetMapping("/home")
	public String homepage() {
		return  "home";
	}
	
	@GetMapping("/response")
	public String GetBooks(Model model) {
		String  Books[]=new String[] {"java", "Springboot",  "hibernate", ".net"};
		model.addAttribute("books", Books);
		return "getBooks";
	}
}

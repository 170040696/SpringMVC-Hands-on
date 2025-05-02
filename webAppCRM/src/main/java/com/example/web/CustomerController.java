package com.example.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Customer;
import com.example.service.iCustomerService;

@Controller
public class CustomerController {

	@Autowired
	private iCustomerService iCustService;
	
	@GetMapping("/customerinfo")
	public String GetAllCustomerData(Model model) {
		
		List<Customer> list=iCustService.GetCustomerInfo();
		model.addAttribute("customers", list);
		return "CustomerInfo";
		
	}
	
	@GetMapping("/showform")
	public String showform(Model model) {
		model.addAttribute("customer", new Customer());
		return "showform";
	}
	
	@PostMapping("/registration")
	public String RegisterCustomer(@ModelAttribute("customer")Customer cust,Model model) {
		iCustService.RegisterCustomer(cust);
		return "redirect:/customerinfo";
	}
	
	@GetMapping("/updateform")
	public String UpdateCustomer(@RequestParam("id")Integer id , Model model) {
		Customer c=iCustService.FetchById(id);
		model.addAttribute("customer", c);
		return "Updateform";
		
	}
	
	@GetMapping("/deleteform")
	public String deleteCustomer(@RequestParam("id")Integer id , Model model) {
		Customer c=iCustService.FetchById(id);
		if(c!=null)
			iCustService.deleteCustomer(id);
		else {
			System.out.println("Customer Not found");
			model.addAttribute("msg", "Customer Not found");
			}
		return "redirect:/customerinfo";
		
	}
}

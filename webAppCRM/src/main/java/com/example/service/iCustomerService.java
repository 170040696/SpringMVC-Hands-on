package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface iCustomerService {

	
	List<Customer> GetCustomerInfo();
	public void RegisterCustomer(Customer customer);
	public Customer FetchById(Integer id);
	public void deleteCustomer(Integer id);
}

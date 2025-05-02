package com.example.service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.iCustomerRepo;
import com.example.model.Customer;

@Service
public class CustomerService implements iCustomerService {

	@Autowired
	private iCustomerRepo icustrepo;
	
	//@Override
	public List<Customer> GetCustomerInfo() {
		// TODO Auto-generated method stub
		return icustrepo.findAll();
	}

	//@Override
	public void RegisterCustomer(Customer customer) {
		// TODO Auto-generated method stub
		icustrepo.save(customer);
	}

	//@Override
	public Customer FetchById(Integer id) {
		// TODO Auto-generated method stub
		
		 java.util.Optional<Customer> optional=icustrepo.findById(id);
		return optional.get();
	}

	//@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		icustrepo.deleteById(id);
	}

}

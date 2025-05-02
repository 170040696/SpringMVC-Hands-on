package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public interface iCustomerRepo extends JpaRepository<Customer, Integer> {
	

}

package com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.model.Customer;

@Repository("customerRepositorys")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setId(121111);
		customer.setFirstName("Walter");
		customer.setLastName("White");
		customer.setUsername("Heisenberg");
		
		customers.add(customer);
		
		return customers;	
	}
}

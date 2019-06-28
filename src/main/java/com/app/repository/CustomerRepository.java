package com.app.repository;

import java.util.List;

import com.app.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
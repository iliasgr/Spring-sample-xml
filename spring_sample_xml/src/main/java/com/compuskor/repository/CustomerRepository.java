package com.compuskor.repository;

import java.util.List;

import com.compuskor.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
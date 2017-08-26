package com.compuskor.service;

import java.util.List;

import com.compuskor.model.Customer;
import com.compuskor.repository.CustomerRepository;
import com.compuskor.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		// TODO Auto-generated constructor stub
		this.customerRepository=customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.compuskor.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}

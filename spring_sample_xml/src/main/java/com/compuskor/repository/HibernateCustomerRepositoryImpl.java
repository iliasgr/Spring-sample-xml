package com.compuskor.repository;

import java.util.ArrayList;
import java.util.List;

import com.compuskor.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.compuskor.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer>customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstname("Ilias");
		customer.setLastname("Skordilis");
		customers.add(customer);
		
		return customers;
		
				
		
	}

}

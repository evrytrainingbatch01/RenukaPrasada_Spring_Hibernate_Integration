package com.evry.SpringDemo.Service;

import java.util.List;

import com.evry.SpringDemo.entity.Customer;




public interface CustomerService {

	public List<Customer> getCustomers();
	
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);


	public List<Customer> searchCustomers(String theSearchName);
	
}

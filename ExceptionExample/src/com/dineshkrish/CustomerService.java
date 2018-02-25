package com.dineshkrish;

public class CustomerService {

	public void add(Customer customer) throws CustomerException, CustomerIdException {
		
		if(customer == null) {
			
			throw new CustomerException("the customer object is null");
		}
		
		if(customer.getCustId() <= 0) {
			
			throw new CustomerIdException("the customer id is invalid");
		}
		
		if(customer.getCustAge() <= 0) {
			
			throw new CustomerException("the customer age is invalid");
		}
		
		if(customer.getCustName().isEmpty()) {
			
			throw new CustomerException("the customer name is invalid");
		}
		
		
		// db operation goes here...
		
		
		System.out.println("customer added successfully...");
	}
	
}

package com.ty.food.controller;

import com.ty.food.dao.CustomerDao;
import com.ty.food.dto.Customer;
import com.ty.food.helper.Encryption;

public class SaveCustomer {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();

		customer.setName("Pavan");
		customer.setEmail(Encryption.encrypt("Pavan@gmail.com"));
		customer.setPhone(782935641l);
		CustomerDao dao = new CustomerDao();
		 dao.saveCustomer(customer);
		
	}

}

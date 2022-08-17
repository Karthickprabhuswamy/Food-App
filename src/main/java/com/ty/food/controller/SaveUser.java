package com.ty.food.controller;

import com.ty.food.dao.CustomerDao;
import com.ty.food.dto.Customer;
import com.ty.food.helper.Encryption;

public class SaveUser {
	
	public static void main(String[] args) {
		
		Customer  customer = new  Customer();
		customer.setName("RaviKumar");
		customer.setEmail(Encryption.encrypt("RaviKumar@123"));
		customer.setPhone(9916325785l);
		
		CustomerDao dao = new CustomerDao();
		
		dao.saveCustomer(customer);
	}

	
}

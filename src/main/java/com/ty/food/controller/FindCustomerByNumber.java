package com.ty.food.controller;

import com.ty.food.dao.CustomerDao;
import com.ty.food.dto.Customer;
import com.ty.food.helper.Decryption;

public class FindCustomerByNumber {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDao();

		Customer customer = dao.findCustomerByNumber(991345267);
		
		System.out.println("Customer Id:" + customer.getId());
		System.out.println("Customer Name:" + customer.getName());
		System.out.println("Customer Email:" + Decryption.decrypt(customer.getEmail()));
		System.out.println("Customer Phone number:" + customer.getPhone());	
	}
}

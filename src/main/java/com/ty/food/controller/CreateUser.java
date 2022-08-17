package com.ty.food.controller;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;
import com.ty.food.helper.Encryption;

public class CreateUser {
	
	public static void main(String[] args)
	{
		
		User user =  new User();
		user.setName("Vibhav");
		user.setEmail(Encryption.encrypt("Vibhav@gmail.com"));
		user.setPassword(Encryption.encrypt("Vibhav@123"));
		user.setPhone(7845112251l);
		user.setJobRole("Asst.Manager");
		
		UserDao dao =  new  UserDao();
		
		dao.createUser(user);
	}

}

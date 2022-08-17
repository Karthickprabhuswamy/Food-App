package com.ty.food.controller;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;
import com.ty.food.helper.Decryption;

public class GetUserById 
{
	public static void main(String[] args) {
		
		User  user  =  new User();
		
		UserDao dao = new UserDao();
		
		User u = dao.getUserById(4);
		
		System.out.println("User Id:"+u.getId());
		System.out.println("User Name:"+u.getName());
		System.out.println("User Email:"+Decryption.decrypt(u.getEmail()));
		System.out.println("User PassWord:"+Decryption.decrypt(u.getPassword()));
		System.out.println("User Phone:"+u.getPhone());
		
		
	}

}

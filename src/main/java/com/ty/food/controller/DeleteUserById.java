package com.ty.food.controller;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class DeleteUserById 
{
	
	public static void main(String[] args) {
		
		User  user  =  new User();
		
		UserDao dao = new UserDao();
		
		System.out.println(dao.deleteUserById(6));
		
	}
}

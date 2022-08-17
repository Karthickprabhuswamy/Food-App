package com.ty.food.controller;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class ValidateUserByPhone {
	
public static void main(String[] args) {
		
		User user  = new User();

		UserDao dao =  new UserDao();
		
		dao.validateUser(7845129631l, "t5GEx756SeMAZq26x9VCdQ==");
		
	}

}

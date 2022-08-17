package com.ty.food.controller;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class ValidateUserByEmail {
	
	public static void main(String[] args) {
		
		User user  = new User();

		UserDao dao =  new UserDao();
		
		dao.validateUser("ugUA0T2ZmePgJjn2Hjc6xlYLw5XGbRKuscEGN+bWc=","t5GEx756SeMAZq26x9VCdQ==");
		
	}
}

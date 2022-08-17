package com.ty.food.controller;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dto.FoodMenu;

public class DeleteFoodById {
	
	public static void main(String[] args) {
		
		FoodMenu foodMenu =  new FoodMenu();
		
		FoodMenuDao dao =  new FoodMenuDao();
		
		dao.deleteFoodById(1);
		
		System.out.println("Deleted");	
	}
		
}

package com.ty.food.controller;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dto.FoodMenu;

public class UpdateFood {
	
	public static void main(String[] args) {
		
		FoodMenu  foodMenu =  new FoodMenu();
		
		foodMenu.setId(2);
		foodMenu.setCost(250);
		foodMenu.setName("Pizza");
		foodMenu.setDiscription("Garlic");
		
		FoodMenuDao  dao =  new FoodMenuDao();
		
		dao.updateFood(foodMenu);
		
		System.out.println("Updated");
		
		
	}

}

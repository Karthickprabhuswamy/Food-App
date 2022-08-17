package com.ty.food.controller;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dto.FoodMenu;

public class SaveFood 
{
	
	public static void main(String[] args) {
		
		FoodMenu foodMenu = new FoodMenu();
		
		foodMenu.setName("Chiken");
		foodMenu.setCost(154.23);
		foodMenu.setDiscription("Crispy");
		
		FoodMenuDao dao =  new FoodMenuDao();
		
		dao.saveFood(foodMenu);
		
	}

}

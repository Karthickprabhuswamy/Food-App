package com.ty.food.controller;

import java.util.List;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dto.FoodMenu;

public class GetAllFood {
	
	public static void main(String[] args) {
		
		FoodMenu foodMenu =  new FoodMenu();
		
		FoodMenuDao dao = new FoodMenuDao();
		
		List<FoodMenu> menu = dao.getAllFood();
		
		for (FoodMenu foodMenu2 : menu) {
			
			System.out.println("Food id--"+foodMenu2.getId());
			System.out.println("Food Name--"+foodMenu2.getName());
			System.out.println("Food Cost--"+foodMenu2.getCost());
			System.out.println("Food Discription--"+foodMenu2.getDiscription());
			
			System.out.println("----------------------------------------------------");
			
		}
		
		
	}

}

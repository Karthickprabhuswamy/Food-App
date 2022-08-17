package com.ty.food.controller;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dto.FoodMenu;

public class GetFoodById {

public static void main(String[] args) {
		
		FoodMenu foodMenu =  new FoodMenu();

		FoodMenuDao  dao = new FoodMenuDao();
		
		FoodMenu  food  =  dao.getFoodById(2);
		
		System.out.println("Food id:"+food.getId());
		System.out.println("Food name:"+food.getName());
		System.out.println("Food cost"+food.getCost());
		System.out.println("Food Description"+food.getDiscription());
}
}

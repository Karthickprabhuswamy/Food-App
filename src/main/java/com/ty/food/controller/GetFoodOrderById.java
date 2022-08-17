package com.ty.food.controller;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

public class GetFoodOrderById {
	
	public static void main(String[] args) 
	{
		FoodOrder foodOrder = new FoodOrder();
		
		FoodOrderDao  dao = new FoodOrderDao();
		
		FoodOrder order = dao.getFoodOrderById(1);
		
		System.out.println(order.getId());
		System.out.println(order.getItems());
		System.out.println(order.getCost());
		System.out.println(order.getStatus());
	
	}

}

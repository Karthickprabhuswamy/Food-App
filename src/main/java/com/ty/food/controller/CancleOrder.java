package com.ty.food.controller;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

public class CancleOrder {
	
	public static void main(String[] args) {
		
		FoodOrder foodOrder =  new FoodOrder();
		
		FoodOrderDao dao =  new FoodOrderDao();
		
		dao.cancleFoodOrder(foodOrder);
	}
}

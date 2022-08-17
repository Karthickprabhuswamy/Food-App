package com.ty.food.controller;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodOrder;

public class UpdateFoodOrder {

	public static void main(String[] args) {

		FoodOrder foodOrder = new FoodOrder();

		FoodOrderDao dao = new FoodOrderDao();

		dao.upadateFood(foodOrder);
	}
}

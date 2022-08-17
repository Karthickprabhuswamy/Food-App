package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dao.FoodMenuDao;
import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodMenu;
import com.ty.food.dto.Items;

public class CreateFoodOrder {

	public static void main(String[] args)

	{
		FoodMenuDao dao = new FoodMenuDao();
		
		FoodMenu foodMenu = dao.getFoodById(1);
		FoodMenu foodMenu2 = dao.getFoodById(2);

		List<Items> items = new ArrayList<Items>();

		FoodOrderDao orderDao = new FoodOrderDao();
		
		Items items2 = orderDao.addItems(foodMenu, 1);
		Items items3 = orderDao.addItems(foodMenu2, 2);
		items.add(items2);
		items.add(items3);

		orderDao.createFoodOrder(items);

	}
}
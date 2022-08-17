package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.FoodMenu;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Items;

public class AddItems {
	
	public static void main(String[] args) {
		
		FoodMenu menu = new FoodMenu();
		
		FoodOrderDao dao =  new FoodOrderDao();
		
		List<Items> items = new ArrayList<Items>();
		
		items.add(dao.addItems(menu, 1));
		items.add(dao.addItems(menu, 2));
		
		FoodOrder foodOrder =  new FoodOrder();
		foodOrder.setItems(items);
		dao.cancleFoodOrder(foodOrder);
	}

}

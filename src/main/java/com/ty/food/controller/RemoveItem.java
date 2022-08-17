package com.ty.food.controller;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.Items;

public class RemoveItem {
	
	public static void main(String[] args) {
		
		Items item =  new Items();
		
		FoodOrderDao dao =  new FoodOrderDao();
		
		dao.removeOrderedItemsById(item);
	}

}

package com.ty.food.controller;

import com.ty.food.dao.FoodOrderDao;
import com.ty.food.dto.Items;

public class GetItemsById {
	
	public static void main(String[] args) {
		
		Items item =  new Items(); 
		
		FoodOrderDao  dao = new FoodOrderDao();
		
	Items items = 	dao.getItemsById(item);
	

	System.out.println(items.getId());
	System.out.println(items.getCost());
	System.out.println(item.getName());
	System.out.println(item.getQuantity());

}

}

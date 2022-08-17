package com.ty.food.dao;

import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ty.food.dto.FoodMenu;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Items;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createFoodOrder(List<Items> items) {

		FoodOrder foodOrder = new FoodOrder();

		Double totalprice = items.stream().collect(Collectors.summingDouble(item -> item.getCost()));

		foodOrder.setStatus("Orederd");
		foodOrder.setCost(totalprice);
		foodOrder.setItems(items);
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();
	}

	public FoodOrder getFoodOrderById(int id) {

		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);

		return foodOrder;
	}

	public boolean cancleFoodOrder(FoodOrder foodOrder) {
		if (foodOrder != null) {
			entityTransaction.begin();
			entityManager.remove(foodOrder);
			entityTransaction.commit();
			return true;
		} else {
			return false;

		}
	}

	public void upadateFood(FoodOrder foodOrder) {
		entityTransaction.begin();
		entityManager.merge(foodOrder);
		entityTransaction.commit();
	}

	public Items addItems(FoodMenu menu, int quantity) {

		Items items = new Items();

		items.setName(menu.getName());
		items.setCost(menu.getCost() * quantity);
		items.setQuantity(quantity);
		entityTransaction.begin();
		entityManager.persist(items);
		entityTransaction.commit();
		return items;
	}

	public Items getItemsById(Items id) {
		Items item = entityManager.find(Items.class, id);
		return item;
	}
	
	public boolean removeOrderedItemsById(int foodid , int itemsid ) {

		FoodOrder foodOrder = getFoodOrderById(itemsid);
		
		Items items = getItemsById(itemsid);



}
	
}

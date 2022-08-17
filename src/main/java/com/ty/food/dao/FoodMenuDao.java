package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Customer;
import com.ty.food.dto.FoodMenu;
import com.ty.food.dto.User;

public class FoodMenuDao {

	public void saveFood(FoodMenu foodMenu) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(foodMenu);

		entityTransaction.commit();

		System.out.println("Data Saved");
	}

	public FoodMenu getFoodById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		FoodMenu foodMenu = entityManager.find(FoodMenu.class, id);

		if (foodMenu != null) {

			System.out.println(foodMenu);

		} else {
			System.out.println("Invalid id");
		}
		return foodMenu;
	}

	public boolean deleteFoodById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		FoodMenu foodMenu = entityManager.find(FoodMenu.class, id);

		if (foodMenu != null) {
			entityTransaction.begin();
			entityManager.remove(foodMenu);
			entityTransaction.commit();
		}
		return false;

	}
	public void updateFood(FoodMenu foodMenu) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.merge(foodMenu);

		entityTransaction.commit();

	}
	
	public List<FoodMenu> getAllFood() 
	{
		boolean result = false;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String jpql =  "select u from FoodMenu u ";
		
		Query query = entityManager.createQuery(jpql);
		
	
		List<FoodMenu> foodMenus =  query.getResultList();
		
		if (!foodMenus.isEmpty()) 
		{
			result = true;
		}
		return foodMenus;
	}


}

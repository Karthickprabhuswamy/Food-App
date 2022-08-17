package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {

	public void createUser(User user) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(user);
	
		entityTransaction.commit();
		
		System.out.println("Data Saved");
	}
	
	
	   public boolean deleteUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user =  entityManager.find(User.class , id);
		
		if (user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
		}
		return false;
		
	   }
 
	public User getUserById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
	User user =	entityManager.find(User.class, id);
		
		if (user!=null) {
			
			System.out.println(user);
			
		}
		else {
			System.out.println("Invalid id");
		}
		return user;
		
	}
	
	public boolean validateUser(String email ,String password) 
	{
		boolean result = false;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String jpql =  "select u from User u where email=?1 and password=?2";
		
		Query query = entityManager.createQuery(jpql);
		
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> users =  query.getResultList();
		
		if (!users.isEmpty()) 
		{
			result = true;
			System.out.println("Login");
		}
		System.out.println("Login failed");
		return result;
	}
	
public boolean validateUser(Long phone ,String password) {
		
		boolean result = false;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String jpql =  "select u from User u where phone=?1 and password=?2";
		
		Query query = entityManager.createQuery(jpql);
		
		query.setParameter(1, phone);
		query.setParameter(2, password);
		
		List<User> users =  query.getResultList();
		
		if (!users.isEmpty())
		{
			result =  true;
			System.out.println("Login");
		}
		System.out.println("Login Failed");
		return result;
	}	
}

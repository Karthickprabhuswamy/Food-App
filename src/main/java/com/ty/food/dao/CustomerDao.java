package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Customer;

public class CustomerDao {

	public void saveCustomer(Customer customer) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(customer);

		entityTransaction.commit();

		System.out.println("Data Saved");
	}

	public Customer findCustomerByNumber(long phone) {

		Customer customer = null;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "Select s from Customer s where phone=?1";

		Query query = entityManager.createQuery(jpql);

		query.setParameter(1, phone);

		List<Customer> customers = query.getResultList();

		if (!customers.isEmpty()) {

			customer = customers.get(0);
		}
		return customer;
	}

	public void updateCustome(Customer customer) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.merge(customer);

		entityTransaction.commit();

	}

}

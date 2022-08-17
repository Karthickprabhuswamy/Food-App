package com.ty.food.dto;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@CreationTimestamp
	private LocalTime orderFoodTime;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	
	private List<Items> items;
	
	private double totalcost;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public LocalTime getOrderFoodTime() {
		return orderFoodTime;
	}

	public void setOrderFoodTime(LocalTime orderFoodTime) {
		this.orderFoodTime = orderFoodTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public double getCost() {
		return totalcost;
	}

	public void setCost(double cost) {
		this.totalcost = cost;
	}

}

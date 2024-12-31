package com.vehicle.rental.customer;

import java.util.ArrayList;
import java.util.List;

import com.vehicle.rental.rental.RentalTransaction;

public class Customer {
	private String name;
	private String customerId;
	private List<RentalTransaction>rentalHistory;
	
	public Customer(String name, String customerId) {
		this.name = name;
		this.setCustomerId(customerId);
		this.rentalHistory = new ArrayList<>();
		
	}
	public void addRental(RentalTransaction rental) {
		rentalHistory.add(rental);
	}
	public List<RentalTransaction> getRentalHistory() {
		return rentalHistory;	
	}
	public String getName() {
		return name;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void addRental(String rental) {
	}
		
	}
	



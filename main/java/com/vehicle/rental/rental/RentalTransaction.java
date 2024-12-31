package com.vehicle.rental.rental;

public class RentalTransaction {
	private String vehicle;
	private String customer;
	private int days;
	private double cost;
	
	public RentalTransaction(String vehicle,String customer,int days,double cost) {
		this.vehicle = vehicle;
		this.customer = customer;
		this.days = days;
		this.cost = cost;
	}
	public String getVehicle() {
		return vehicle;
	}
    public String getCustomer() {
    	return customer;
    }
    public int getDays() {
    	return days;
    }
    public double getCost() {
    	return cost;
    }
}

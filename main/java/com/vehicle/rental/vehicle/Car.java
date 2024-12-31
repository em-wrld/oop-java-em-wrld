package com.vehicle.rental.vehicle;

public class Car extends Vehicle {
	private String luxuryLevel;
	public Car(String vehicleId, String model,double baseRentalRate,String luxuryLevel) {
		super(vehicleId,model,baseRentalRate);	
		this.luxuryLevel = luxuryLevel;
	}
	@Override
	public double calculateRentalCost(int days) {
		double multiplier = luxuryLevel.equalsIgnoreCase("luxury")?1.5 : 1.0;
		return getbaseRentalRate()* multiplier * days;
	}
	
	@Override
	public boolean isAvailableForRental() {
		return isAvailable();
	}
	@Override
	public boolean isAvaiableForRental() {
		return false;
	}
	
	}
	
	
	
	



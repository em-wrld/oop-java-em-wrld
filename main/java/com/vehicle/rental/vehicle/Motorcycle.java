package com.vehicle.rental.vehicle;

public class Motorcycle extends Vehicle{
	public Motorcycle(String vehicleId, String model, double baseRentalRate) {
		super(vehicleId, model, baseRentalRate);
	}
	@Override
	public double calculateRentalCost(int days) {
		return getbaseRentalRate()* days * 0.9;// 10% discount
		
	}
	@Override
	public boolean isAvaiableForRental() {
		return isAvailable();
	}

}

package com.vehicle.rental.vehicle;

public class Truck extends Vehicle{

	public Truck(String vehicleId, String model, double baseRentalRate) {
		super(vehicleId, model, baseRentalRate);
		
	}

	@Override
	public double calculateRentalCost(int days) {
		return 0;
	}

	@Override
	public boolean isAvaiableForRental() {
		return false;
	}
	

}

package com.vehicle.rental.vehicle;

public abstract class Vehicle {
	private String vehicleId;
	private String model;
	private double baseRentalRate;
	private boolean isAvailable;
	
	public Vehicle(String vehicleId, String model, double baseRentalRate) {
		this.vehicleId = vehicleId;
		this.model = model;
		this.baseRentalRate = baseRentalRate;
		this.isAvailable = true;	
	}
    public String getVehicleId() {
    	return vehicleId;
    	
    }
    public String getModel() {
    	return model;
    }
    public double getbaseRentalRate() {
    	return baseRentalRate;
    }
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
    //Abstract methods
	public abstract double calculateRentalCost(int days);
	public abstract boolean isAvaiableForRental();
	public boolean isAvailableForRental() {
		return false;
	}
	}


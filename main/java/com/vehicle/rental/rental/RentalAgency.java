package com.vehicle.rental.rental;

import java.util.ArrayList;
import java.util.List;

import com.vehicle.rental.customer.Customer;
import com.vehicle.rental.vehicle.Vehicle;

public class RentalAgency {
	private List<Vehicle> vehicles;
	
	public RentalAgency() {
		this.vehicles = new ArrayList<>();
	}
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	public boolean rentVehicle(String vehicleId, Customer customer, int days) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                double cost = vehicle.calculateRentalCost(days);
                vehicle.setAvailable(false);
                customer.addRental("Rented " + vehicle.getModel() + " for $" + cost);
                return true;	
			
		}
		
	}
		return false;
		
	}
	public void returnVehicle(String vehicleId) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleId().equals(vehicleId)){
				vehicle.setAvailable(true);
				break;
			}
		}
	}
				
			
		}
	



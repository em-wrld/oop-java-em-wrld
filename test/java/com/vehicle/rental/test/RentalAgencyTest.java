package com.vehicle.rental.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.vehicle.rental.vehicle.*;
import com.vehicle.rental.customer.Customer;
import com.vehicle.rental.rental.RentalAgency;

	public class RentalAgencyTest {
		@Test
		public void testRentVehicle() {
			RentalAgency agency = new RentalAgency();
			Vehicle car = new Car("C1", "Sedan", 50.0, "Luxury");
	        agency.addVehicle(car);
	        Customer customer = new Customer("John Doe", "CUST001");

	        // Test renting a vehicle
	        boolean success = agency.rentVehicle("CAR123", customer, 3);
	        assertTrue(success, "Vehicle should be rented successfully.");
	        assertFalse(car.isAvailable(), "Vehicle should no longer be available after rental.");
	    }

	    @Test
	    public void testRentUnavailableVehicle() {
	        RentalAgency agency = new RentalAgency();
	        Vehicle car = new Car("CAR123", "Sedan", 50.0, "Luxury");
	        agency.addVehicle(car);
	        Customer customer = new Customer("John Doe", "CUST001");

	        // Rent the vehicle once
	        agency.rentVehicle("CAR123", customer, 3);

	        // Attempt to rent the same vehicle again
	        boolean success = agency.rentVehicle("CAR123", customer, 2);
	        assertFalse(success, "Vehicle should not be rented if it's already unavailable.");
	    }

	    @Test
	    public void testReturnVehicle() {
	        RentalAgency agency = new RentalAgency();
	        Vehicle car = new Car ("CAR123", "Sedan", 50.0, "Luxury");
	        agency.addVehicle(car);
           
	        Customer customer = new Customer("John Doe","CUSTOO1");
	        agency.rentVehicle("CAR 123", customer, 3);
	        agency.returnVehicle("CAR123");
	        
	        assertTrue(car.isAvailable(),"Vehicle should be available again after being returned.");
	    }
			
		
	}



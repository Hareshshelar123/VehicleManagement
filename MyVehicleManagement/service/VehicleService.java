package com.vehicle.management.service;

import java.util.List;

import com.vehicle.management.bean.Vehicle;

import com.vehicle.management.dto.VehicleDto;

public interface VehicleService {

	VehicleDto saveVehicle(VehicleDto vehicleDto);

	Vehicle getVehicleById(Long id);

	List<Vehicle> getAllVehicles();

	Vehicle updateVehicle(Long id, Vehicle vehicle);

	void deleteVehicle(Long id);

//	public List<Vehicle> getAllVehicle() {
//		List<Vehicle> vehicle = new ArrayList<Vehicle>();
//		vehicleRepo.findAll().forEach(vehicle::add);
//		return vehicle;
//
//	}
//
//	public void addVehicle(Vehicle vehicle) {
//		vehicleRepo.save(vehicle);
//	}
//
//	public void updatevehicle(Vehicle vehicle) {
//		vehicleRepo.save(vehicle);
//	}
//
//	public void deletevehicle(Vehicle vehicle) {
//		vehicleRepo.delete(vehicle);
//	}

}

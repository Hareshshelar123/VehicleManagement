package com.vehicle.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.management.bean.Vehicle;
import com.vehicle.management.dto.VehicleDto;
import com.vehicle.management.service.VehicleService;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
//@Api(tags ="vehicle Api")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;

	//@ApiOperation("add new vehicle")
	@PostMapping("/addVehicle")
	public ResponseEntity<VehicleDto> saveVehicle(@RequestBody VehicleDto vehicleDto) {
		return new ResponseEntity<VehicleDto>(vehicleService.saveVehicle(vehicleDto), HttpStatus.CREATED);
	}
 
	//@ApiOperation("get vehicle by id")
	@GetMapping("/getVehicle/{id}")
	public ResponseEntity<Vehicle> getVehicle(@PathVariable("id") long id) {
		return new ResponseEntity<Vehicle>(vehicleService.getVehicleById(id), HttpStatus.OK);
	}

	//@ApiOperation("get all vehicle")
	@GetMapping
	public ResponseEntity<List<Vehicle>> getAllVehicle() {
		List<Vehicle> vehicle = vehicleService.getAllVehicles();
		return ResponseEntity.ok(vehicle);
	}

	//@ApiOperation("update vehicle by id")
	@PutMapping("/{id}")
	public ResponseEntity<Vehicle> updateVehicle(@PathVariable long id, @RequestBody Vehicle vehicle) {
		Vehicle updated = vehicleService.updateVehicle(id, vehicle);
		if (updated != null) {
			return ResponseEntity.ok(updated);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	//@ApiOperation("Delete veicle")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
		vehicleService.deleteVehicle(id);
		return ResponseEntity.noContent().build();
	}

	// public List<Vehicle> getAllVehicle();

	// public void updateVehicle(@PathVariable long id,@RequestBody Vehicle
	// updatVehicle);

	// public void deleteVehicle(@PathVariable long id,@RequestBody Vehicle
	// vehicle);

//	@Autowired
//	private VehicleService vehiclesservice;
//
//	@GetMapping("/vehicle")
//	public List<Vehicle> getAllVehicle() {
//		return vehiclesservice.getAllVehicle();
//
//	}
//     @PostMapping("/addvehicle")
//	public void addVehicle(@RequestBody Vehicle vehicle) {
//		vehiclesservice.addVehicle(vehicle);
//	}
//
//	@PutMapping("/updatevehicle/{id}")
//	public void updateVehicle(@PathVariable String id, @RequestBody Vehicle vehicle) {
//		vehiclesservice.updatevehicle(vehicle);
//	}
//
//	@DeleteMapping("/deletevehicle/{id}")
//	public void deleteVehicle(@PathVariable String id, @RequestBody Vehicle vehicle) {
//		vehiclesservice.deletevehicle(vehicle);

}

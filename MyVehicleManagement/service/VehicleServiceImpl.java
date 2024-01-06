package com.vehicle.management.service;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.management.bean.Vehicle;
import com.vehicle.management.dto.VehicleDto;
import com.vehicle.management.mapper.VehicleMapper;
import com.vehicle.management.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	private VehicleMapper vehicleMapper=Mappers.getMapper(VehicleMapper.class);

	@Override
	public VehicleDto saveVehicle(VehicleDto vehicleDto) {
		//Vehicle vehicle=VehicleMapper.vehicledto.myVehicle(vehicledto);
        Vehicle vehicle=vehicleMapper.mapVehicleDtoToVehicle(vehicleDto);
        Vehicle saveVehicle=vehicleRepository.save(vehicle);
		return vehicleMapper.mapVehicleToVehicleDto(saveVehicle);
	}

	@Override
	public Vehicle getVehicleById(Long id) {

		return vehicleRepository.findById(id).orElse(null);

	}

	@Override
	public List<Vehicle> getAllVehicles() {

		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle updateVehicle(Long id, Vehicle vehicle) {

		Vehicle existingVehicle = vehicleRepository.findById(id).orElse(null);

		if (existingVehicle != null) {
			existingVehicle.setVehicalRegistrationNumber(vehicle.getVehicalRegistrationNumber());
			existingVehicle.setOwnerName(vehicle.getOwnername());
			existingVehicle.setBrand(vehicle.getBrand());
			existingVehicle.setRegistrationExpires(vehicle.getRegistrationExpires());
			existingVehicle.setActive(vehicle.isActive());
			existingVehicle.setCreatedby(vehicle.getCreatedby());
			existingVehicle.setCreationtime(vehicle.getCreationtime());
			existingVehicle.setModifiedby(vehicle.getModifiedby());
			existingVehicle.setModifiedtime(vehicle.getModifiedtime());
			
			return vehicleRepository.save(existingVehicle);

		} else {

			return null;
		}
	}

	@Override
	public void deleteVehicle(Long id) {
		vehicleRepository.deleteById(id);

	}

}

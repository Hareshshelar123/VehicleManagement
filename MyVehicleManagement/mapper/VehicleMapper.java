package com.vehicle.management.mapper;

import org.mapstruct.Mapper;

import com.vehicle.management.bean.Vehicle;
import com.vehicle.management.dto.VehicleDto;

@Mapper(componentModel="spring")
public interface VehicleMapper {
	
	Vehicle mapVehicleDtoToVehicle(VehicleDto vehicledto);
	
	VehicleDto mapVehicleToVehicleDto(Vehicle vehicle);
	
	
	

}

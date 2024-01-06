package com.vehicle.management.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;




public class VehicleDto {

	private long id;

	private String vehicalRegistrationNumber;
	private String ownername;
	private String brand;
	private LocalDate registrationExpires;
	private boolean isActive;
	private String createdby;
	private LocalDate creationtime;
	private String modifiedby;
	private LocalDateTime modifiedtime;
	
	public VehicleDto() {
		super();
	}
	public VehicleDto(long id, String vehicalRegistrationNumber, String ownername, String brand,
			LocalDate registrationExpires, boolean isActive, String createdby, LocalDate creationtime,
			String modifiedby, LocalDateTime modifiedtime) {
		super();
		this.id = id;
		this.vehicalRegistrationNumber = vehicalRegistrationNumber;
		this.ownername = ownername;
		this.brand = brand;
		this.registrationExpires = registrationExpires;
		this.isActive = isActive;
		this.createdby = createdby;
		this.creationtime = creationtime;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicalRegistrationNumber() {
		return vehicalRegistrationNumber;
	}
	public void setVehicalRegistrationNumber(String vehicalRegistrationNumber) {
		this.vehicalRegistrationNumber = vehicalRegistrationNumber;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public LocalDate getRegistrationExpires() {
		return registrationExpires;
	}
	public void setRegistrationExpires(LocalDate registrationExpires) {
		this.registrationExpires = registrationExpires;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalDate getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(LocalDate creationtime) {
		this.creationtime = creationtime;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public LocalDateTime getModifiedtime() {
		return modifiedtime;
	}
	public void setModifiedtime(LocalDateTime modifiedtime) {
		this.modifiedtime = modifiedtime;
	}
	

}

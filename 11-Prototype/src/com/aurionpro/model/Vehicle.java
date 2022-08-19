package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

	private List<String> VehicleList;

	public Vehicle() {
		this.VehicleList = new ArrayList<String>();
	}

	public Vehicle(List<String> list) {
		this.VehicleList = list;
	}

	public void insertData() {
		VehicleList.add("Scorpio");
		VehicleList.add("Creta");
		VehicleList.add("Nexon");
		VehicleList.add("Safari");
	}

	public List<String> getVehicleList() {
		return this.VehicleList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<>();
		for (String s : this.getVehicleList()) {
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}

	@Override
	public String toString() {
		return "Vehicle{" + "VehicleList=" + VehicleList + '}';
	}
}
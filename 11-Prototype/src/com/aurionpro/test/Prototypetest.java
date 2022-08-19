package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Vehicle;

public class Prototypetest {
	 public static void main(String[] args) throws CloneNotSupportedException {
	        Vehicle a = new Vehicle();
	        a.insertData();
	        List<String> list1 = a.getVehicleList();
	       

	        Vehicle b = (Vehicle)a.clone();
	        list1.add("tata");
	        List<String> list = b.getVehicleList();
	        list.add("XUV700");

	        System.out.println(a.getVehicleList());
	        System.out.println(list);

}
}

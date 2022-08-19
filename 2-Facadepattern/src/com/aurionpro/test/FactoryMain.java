package com.aurionpro.test;

import com.aurionpro.model.OS;
import com.aurionpro.model.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS obj = osf.getInstance("closed");
		obj.spec();
	}

}

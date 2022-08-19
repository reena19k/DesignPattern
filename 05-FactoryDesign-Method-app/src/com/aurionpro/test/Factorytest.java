package com.aurionpro.test;

import com.aurionpro.model.BMWFactory;
import com.aurionpro.model.IAutoMobile;
import com.aurionpro.model.IAutoMobileFactory;
import com.aurionpro.model.Marutifactory;
import com.aurionpro.model.TeslaFactory;

public class Factorytest {

	public static void main(String[] args) {
		IAutoMobileFactory fact = BMWFactory.getInstance();
		IAutoMobile bmw= fact.makeAutoMobile();
		bmw.start();
		bmw.stop();
		
		IAutoMobileFactory fact2 = TeslaFactory.getInstance();
		IAutoMobile tesla =fact2.makeAutoMobile();
		tesla.start();
		tesla.stop();
		
		
		IAutoMobileFactory fact3 = Marutifactory.getInstance();
		IAutoMobile maruti =fact3.makeAutoMobile();
		maruti.start();
		maruti.stop();
	}

}

package com.aurionpro.model;

public class AutoMobileTest {

	public static void main(String[] args) {
		AutoMobileFactory fact =new AutoMobileFactory();
		IAutoMobile bmw= fact.makeAutomobile(AutoType.BMW);
		bmw.start();
		bmw.stop();
	}

}

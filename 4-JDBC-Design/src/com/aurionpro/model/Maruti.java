package com.aurionpro.model;

public class Maruti implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Maruti is start");
	}

	@Override
	public void stop() {
		System.out.println("Maruti is stop");
	}

}

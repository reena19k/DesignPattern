package com.aurionpro.model;

public class BMW implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW is start");
	}

	@Override
	public void stop() {
		System.out.println("BMW is stop");
	}

}

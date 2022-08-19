package com.aurionpro.model;

public class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Tesla is start");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stop");
	}

}

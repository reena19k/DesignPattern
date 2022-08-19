package com.aurionpro.model;

public class LaptopBuilder {
	private Laptop laptop;

	public LaptopBuilder() {
	
		laptop = new Laptop();
	}
	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
		
	}
	public LaptopBuilder addRam(String ram) {
		laptop.setRam(ram);
		return this;
	}
	
	public LaptopBuilder addKeyboard(String keyboard) {
		laptop.setKeyboard(keyboard);
		return this;
	}
	
	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}
	
	public LaptopBuilder addTouchScreen(boolean touchScreen) {
		laptop.setTouchscreen(touchScreen);
		return this;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	

}

package com.aurionpro.model;

public class Laptop {
	private String ram;
	private String hdd;
	private String keyboard;
	private String mouse;
	private boolean touchscreen;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public boolean getTouchscreen() {
		return touchscreen;
	}
	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyboard=" + keyboard + ", mouse=" + mouse + ", touchscreen="
				+ touchscreen + "]";
	}
	
	
	

}

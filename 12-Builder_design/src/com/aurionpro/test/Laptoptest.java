package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class Laptoptest {

	public static void main(String[] args) {
		Laptop laptop = new LaptopBuilder().addHdd("500gb").addKeyboard("acer").addMouse("hp").addRam("sixteen")
				.addTouchScreen(true).getLaptop();
		System.out.println(laptop);
	}

}

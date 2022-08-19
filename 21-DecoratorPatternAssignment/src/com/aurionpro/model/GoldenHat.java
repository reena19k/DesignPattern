package com.aurionpro.model;

public class GoldenHat extends HatDecorater {
	public GoldenHat(IHat changeHat) {
		super(changeHat);
	}
	
	public String getName() {
		ModifyToGold();
		return hatType.getName();
	}

	@Override
	public String getPrice() {
		ModifyToGold();
		return hatType.getPrice();
	}

	@Override
	public String getDescription() {
		ModifyToGold();
		return hatType.getDescription();
	}

	public void ModifyToGold() {
		System.out.println("Hat is Now GoldColored");
	}
}

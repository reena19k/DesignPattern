package com.aurionpro.model;

public class BMWFactory implements IAutoMobileFactory {
static IAutoMobileFactory bmw;
	
	private BMWFactory() {
	}
	
	public static IAutoMobileFactory getInstance() {
		if (bmw == null) {
			bmw = new BMWFactory();
		}
		return bmw;
	}

	@Override
	public IAutoMobile makeAutoMobile() {
		return new BMW();
}
}

	

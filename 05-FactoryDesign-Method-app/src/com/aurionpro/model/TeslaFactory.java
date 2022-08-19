package com.aurionpro.model;

public class TeslaFactory implements IAutoMobileFactory {
static IAutoMobileFactory tesla;
	
	private TeslaFactory() {
	}
	
	public static IAutoMobileFactory getInstance() {
		if (tesla == null) {
			tesla = new TeslaFactory();
		}
		return tesla;
	}
	@Override
	public IAutoMobile makeAutoMobile() {
		return new Tesla();

}
}

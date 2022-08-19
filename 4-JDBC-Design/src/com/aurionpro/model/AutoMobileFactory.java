package com.aurionpro.model;

public class AutoMobileFactory {
	public IAutoMobile makeAutomobile(AutoType bmw1) {
		if (bmw1.equals(AutoType.BMW))
			return new BMW();
		if (bmw1.equals(AutoType.Tesla))
			return new Tesla();
		if (bmw1.equals(AutoType.Mruti))
			return new Maruti();
		return null;
	}

}

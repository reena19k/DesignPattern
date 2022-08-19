package com.aurionpro.model;

public class Marutifactory implements IAutoMobileFactory {
static IAutoMobileFactory maruti;
	
	private Marutifactory() {
		
	}
	
	public static IAutoMobileFactory getInstance() {
		if (maruti == null) {
			maruti = new Marutifactory();
		}
		return maruti;
	}
	@Override
	public IAutoMobile makeAutoMobile(){
		return new Maruti();
		// TODO Auto-generated method stub

	}

}

package com.aurionpro.model;

public class OperatingSystemFactory {
	public OS getInstance(String str) {
		if(str.equals("open"))
			return new Andoird();
		else if(str.equals("closed"))
			return new IOS();
		else 
			return new Windows();
	}
}

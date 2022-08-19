package com.aurionpro.test;

import com.aurionpro.model.Direction;

public class EnumExample {

	public static void main(String[] args) {
		{
	        Direction north = Direction.NORTH;
	         
	        System.out.println(north);
	        System.out.println("_______");
	        Direction[] directions = Direction.values();
	        
	        for (Direction d : directions) {
	            System.out.println(d);
	        }
		}
	}

}

package com.aurionpro.test;

import com.aurionpro.model.Direction;

public class Directiontest {

	public static void main(String[] args) {
		Direction north = Direction.NORTH;
        
		System.out.println( north );                      //NORTH
		 
		System.out.println( north.getAngle() );           //90
		 
		System.out.println( Direction.NORTH.getAngle() );
	}

}

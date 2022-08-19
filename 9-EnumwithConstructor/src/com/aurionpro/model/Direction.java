package com.aurionpro.model;

public enum Direction {
	 EAST(0), WEST(180), NORTH(90), SOUTH(270);
	 
    private Direction(final int angle) {
        this.angle = angle;
    }
 
    private int angle;
 
    public int getAngle() {
        return angle;
    }
}

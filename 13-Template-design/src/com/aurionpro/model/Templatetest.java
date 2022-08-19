package com.aurionpro.model;

public class Templatetest {

	public static void main(String[] args) {
		 Game game = new Cricket();
	        game.warmUp();
	        game.StartPlaying();
	        game.endPlaying();
	        System.out.println("------------");
	        game = new Football();
	        game.warmUp();
	        game.StartPlaying();
	        game.endPlaying();
	}
}



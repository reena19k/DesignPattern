package com.aurionpro.model;

public class Cricket extends Game {
	@Override
	void gym() {
		System.out.println("Do Biceps and Triceps exercise");
	}

	@Override
	void jogging() {
		System.out.println("Run on treadmill for 30 mins");
	}

	@Override
	void planning() {
		System.out.println("plan to get most wickets and most runs");
	}

	@Override
	void play() {
		System.out.println("Our team is playing cricket");
	}

	@Override
	void win() {
		System.out.println("We won this game by scoring 1000 runs");
	}

	@Override
	void congratulate() {
		System.out.println("Man of Match award is presented");
	}
}

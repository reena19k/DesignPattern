package com.aurionpro.model;

public class Football extends Game {
	@Override
	void gym() {
		System.out.println("Do Legs exercise");
	}

	@Override
	void jogging() {
		System.out.println("Run more on ground");
	}

	@Override
	void planning() {
		System.out.println("plan to tackle and pass");
	}

	@Override
	void play() {
		System.out.println("our team is playing football");
	}

	@Override
	void win() {
		System.out.println("we won by scoring more goals");
	}

	@Override
	void congratulate() {
		System.out.println("present the MVP award");
	}
}

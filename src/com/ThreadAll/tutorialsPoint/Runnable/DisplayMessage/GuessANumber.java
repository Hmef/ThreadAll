package com.ThreadAll.tutorialsPoint.Runnable.DisplayMessage;

public class GuessANumber extends Thread{

	private int number;
	
	public GuessANumber(int number) {
		this.number = number;
	}
	public void run() {
		int counter = 0;
		int guess = 0;
		do {
			guess = (int) Math.random();
			System.out.println(this.getName() +" gesses " + guess);
			counter++;
		} while (guess != number);
		System.out.println("**Correct"+ this.getName() + "in" + counter + "guesses");
	}
}

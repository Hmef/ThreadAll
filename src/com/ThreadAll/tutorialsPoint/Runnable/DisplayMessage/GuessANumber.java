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
			guess = (int) (Math.random() * 10); 
			System.out.println(this.getName() +" gesses " + guess);
			counter++;
			System.out.println(" Counter is " + counter);
		} while (guess != number);
		System.out.println("** Correct! "+ this.getName() + " in " + counter + " guesses ");
	}
}


// Math.random() * 10 ==> 0 - 9.9999... 
// (int) (Math.random() * 10) ==> 0 - 9 ( fraction will be dropped when cast to an int )
// (int) (Math.random() * 10 + 1) ==> 0 - 10
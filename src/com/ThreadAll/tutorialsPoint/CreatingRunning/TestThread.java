package com.ThreadAll.tutorialsPoint.CreatingRunning;

public class TestThread {

	public static void main(String[] args) {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.run();
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.run();
	}
}

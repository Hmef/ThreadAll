package com.ThreadAll.tutorialsPoint.CreatingRunning;

public class TestThread {

	public static void main(String[] args) {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.run();
	}
}

package com.ThreadAll.tutorialsPoint.ThreadDemo;

public class ThreadDemo extends Thread {

	private String threadName;
	private Thread t;
	
	public ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run(){
		System.out.println("Running " + threadName);
		for(int i = 4; i > 0 ; i--) {
			System.out.println("Thread: " + threadName + ", " + i);
		}
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if(t == null) {
			t = new Thread(this, threadName); ///////
			t.start();
		}
	}
}

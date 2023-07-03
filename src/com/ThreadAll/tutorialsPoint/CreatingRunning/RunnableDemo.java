package com.ThreadAll.tutorialsPoint.CreatingRunning;

public class RunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;
	
	RunnableDemo(String name) {
		
		threadName = name;
		System.out.println(" ");
		System.out.println(" ===== Creating " + threadName + " ===== ");
		System.out.println(" ");
	}
	
	public void run() {
		System.out.println(" Running " + threadName);
		System.out.println(" ");
		for(int i=4; i>0; i--) {
			System.out.println(" Thread " + threadName + " , " + i );
			//Thread.sleep(50);
			
		}
	}


}

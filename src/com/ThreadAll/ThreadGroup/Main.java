package com.ThreadAll.ThreadGroup;

public class Main {

	public static void main(String[] args) {
		
		Runnable runnable = new TestThreadGroup();
		ThreadGroup myThreadGroup = new ThreadGroup(" Test Thread Group");
		Thread t = new Thread(myThreadGroup, runnable);
		System.out.println(" Thread Group : " + t.getThreadGroup());
		System.out.println(" Thread Group Name : " + t.getThreadGroup().getName());
		System.out.println(" number of active threads in the Group : " + t.getThreadGroup().activeCount());
		t.start();
		System.out.println(" number of active threads in the Group : " + t.getThreadGroup().activeCount());
		//t.notify();
		System.out.println(" thread is alive : " + t.isAlive());
		Thread.interrupted();
		System.out.println(" thread is interreptued : " + t.isInterrupted()); // !!!!!
		
	}
}

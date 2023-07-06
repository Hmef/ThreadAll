package com.ThreadAll.ThreadGroup;

public class Main {

	public static void main(String[] args) {
		
		Runnable runnable = new TestThreadGroup();
		ThreadGroup myThreadGroup = new ThreadGroup(" Test Thread Group");
		Thread t = new Thread(myThreadGroup, runnable);
		System.out.println(" Thread Group : " + t.getThreadGroup());
		System.out.println(" Thread Group Name : " + t.getThreadGroup().getName());
		t.start();
	}
}

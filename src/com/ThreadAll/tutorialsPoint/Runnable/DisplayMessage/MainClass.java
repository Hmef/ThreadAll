package com.ThreadAll.tutorialsPoint.Runnable.DisplayMessage;

public class MainClass {

	public static void main(String[] args) {

		Runnable hello = new DisplayMessage("Hello");
		//DisplayMessage hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(hello); // new Thread(Runnable target)
		thread1.setDaemon(true);
		thread1.setName("hello");
		//thread1.setPriority(3);
		System.out.println(" Starting hello thread ..... ");
		thread1.start();

		Runnable bye = new DisplayMessage("Goodbye");
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MAX_PRIORITY); // Change access to static using Thread instead of thread2
		//thread2.setPriority(9);
		thread2.setName("bye");
		thread2.setDaemon(true);
		System.out.println(" Starting Goodbye thread ..... ");
		System.out.println(" before start() method - thread2 is Alive ?? " + thread2.isAlive());
		thread2.start();
		System.out.println(" after start() method - thread2 is Alive ?! " + thread2.isAlive());

		
		/*
		System.out.println(" Starting thread3 ..... ");
		Thread thread3 = new GuessANumber(4);
		thread3.setName("thread3");
		thread3.start();
		
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(" Thread interrupted ");
		}
		
		System.out.println(" Starting thread4 ...");
		Thread thread4 = new GuessANumber(2);
		thread4.setName("thread4");
		thread4.start();
		*/
		System.out.println(" main is ending ...");
		
		
	}
}

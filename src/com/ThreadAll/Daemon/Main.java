package com.ThreadAll.Daemon;

public class Main {
	
	public static void main(String[] args) {
		
		Thread daemonThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while (true) {
						System.out.println(" Execution daemon ");
					}
				} finally {
					// TODO: handle finally clause
					System.out.println(" fin daemon ");
				}
				
			}
			
		}, "Daemon");
		
		daemonThread.setDaemon(true);
		daemonThread.start();
	}

	

}

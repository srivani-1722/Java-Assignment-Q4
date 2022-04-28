package com.srivani;

public class JavaThreads extends Thread {
	public void run() {
		for(int i=1;i<=5;i++)
	    System.out.println("This code is running in a thread" + i);
	  }
	
	public static void main(String[] args) throws InterruptedException {
		JavaThreads thread = new JavaThreads();
	    thread.start();
	    for(int i=1;i<=5;i++) {
	    System.out.println("This code is outside of the thread in main "+i);
	    Thread.sleep(1000);
	    }
		
	}

}

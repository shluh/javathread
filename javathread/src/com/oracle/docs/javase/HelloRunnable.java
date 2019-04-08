package com.oracle.docs.javase;

public class HelloRunnable implements Runnable{
	public void run() {
		System.out.println("Thread Runnable");
	}
	
	public static void main(String args[]) {
		(new Thread(new HelloRunnable())).start();
	}

}

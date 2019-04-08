package javathread;

public class MyRunnable implements Runnable{ 
	
	public static void main(String [] args){
		 
		MyRunnable r = new MyRunnable();// line 6
		Thread t = new Thread(r);// line 7
		Thread t2 = new Thread(r);
		t.start();// line 8
		}

	@Override
	public void run() {
		System.out.println("Run1");
		
	}
}

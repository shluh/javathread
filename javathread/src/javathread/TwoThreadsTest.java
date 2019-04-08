package javathread;

public class TwoThreadsTest {

	public static void main(String[] args) {
		new SimpleThread("thread01").start();
        new SimpleThread("thread02").start();

	}

}

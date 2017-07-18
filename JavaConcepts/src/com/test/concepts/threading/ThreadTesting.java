package com.test.concepts.threading;

public class ThreadTesting {/*

	public static void main(String[] args) {
		
		Counter c = new Counter();
		System.out.println("------Main Starting Ending !!!!!------->> " + c.value());
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				c.increment();
				c.decrement();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				c.increment();
				c.decrement();			}
		});

		t1.setName("Thread One : ");
		t2.setName("Thread Two : ");
		t1.start();
		t2.start();

		
		 * try { t1.join(); t2.join(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 
		System.out.println("------Main Thread Ending !!!!!------->> " + c.value());
	}

*/}

class Counter {

	private int c = 0;

	public void increment() {
		for (int i = 0; i < 10; i++) {
			c++;
			System.out.println(Thread.currentThread().getName() + " increment " + c);
		}

	}

	public void decrement() {
		for (int i = 0; i < 10; i++) {
			c--;
			System.out.println(Thread.currentThread().getName() + " decrement " + c);
		}
	}

	public int value() {
		return c;
	}
}

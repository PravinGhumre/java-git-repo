package com.test.concepts.threading;

public class WaitNotifyTest {

	public static void main(String[] args) {/*

		Message message = new Message();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				String messageString = message.sayHello();
				System.out.println("Message sent ==>> " + messageString);
			}
		});
		t1.setName("Sender : ");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				String messageString = message.getHello();
				System.out.println("Message received ==>> " + messageString);
			}
		});
		t2.setName("Receiver : ");

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				message.toggleMessageStatus();
				System.out.println("Message Boolean Setter ==>> " + message.isHelloPresent());
			}
		});
		t3.setName("Message Setter : ");
		t3.start();
		t1.start();
		t2.start();

	*/}

}

class Message {

	private String message;

	private boolean isHelloPresent = true;

	public boolean isHelloPresent() {
		return isHelloPresent;
	}

	public void setHelloPresent(boolean isHelloPresent) {
		this.isHelloPresent = isHelloPresent;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public synchronized String getHello() {

		try {
			this.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (!isHelloPresent) {
			try {
				System.out.println(Thread.currentThread().getName() + "I am waiting for you to send message !!!");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("I am interuppted !!!!!!!!!!!");
			}
		}
		this.isHelloPresent = true;
		return this.message;
	}

	public synchronized String sayHello() {

		try {
			while (isHelloPresent) {
				System.out.println(Thread.currentThread().getName() + "I am waiting to send message !!!");
				this.wait();
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("I am interuppted !!!!!!!!!!!");
		}
		this.isHelloPresent = true;
		this.message = "Hello Buddy";
		System.out.println(Thread.currentThread().getName() + "I am sending message  !!!");
		this.notifyAll();
		return this.message;
	}

	public synchronized void toggleMessageStatus() {

		this.setHelloPresent(false);
		notifyAll();
	}

}

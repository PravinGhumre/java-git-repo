package com.test.concepts.threading;

public class Queue {

	private static class Element {
		final Object value;
		Element next;

		Element(Object value) {
			this.value = value;
		}
	}

	private Element first, last;
	private int curSize, maxSize;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
	}

	public synchronized void put(Object o) throws InterruptedException {
		while (this.curSize == this.maxSize) {
			this.wait();
		}
		if (this.first == null) {
			this.first = (this.last = new Element(o));
		} else {
			this.last = (this.last.next = new Element(o));
		}
		this.curSize++;
		this.notifyAll();
	}

	public synchronized Object get() throws InterruptedException {
		while (this.curSize == 0) {
			this.wait();
		}
		Object o = this.first.value;
		this.first = this.first.next;
		this.curSize--;
		this.notifyAll();
		return o;
	}

	public static void main(String[] args) throws InterruptedException {

		Queue queue = new Queue(5);
		
		
		
		queue.put(new String("A"));
		queue.put(new String("B"));
		queue.put(new String("C"));
		queue.put(new String("D"));
		queue.put(new String("E"));
		queue.put(new String("F"));
		
		String value = queue.last.toString();
		System.out.println("value = " + value);
		
		
		String value1 = queue.last.toString();
		System.out.println("value1 = " + value1);
	}
}



package cn.hdlmx.design;

import java.util.LinkedList;

public class MyContainer<T> {
	final private LinkedList<T> list = new LinkedList<>();
	private final int MAX = 10;
	private int count = 0;

	public synchronized void put(T t) {
		while (list.size() >= MAX) {
			try {
				this.wait();
				System.out.println("存储已满，等待消费者");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		list.add(t);
		++count;
		this.notifyAll();
	}

	public synchronized T get() {
		T t = null;
		while (list.size() == 0) {
			try {
				this.wait();
				System.out.println("存储已空，等待生产者");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		t = list.removeFirst();
		--count;
		this.notifyAll();
		return t;

	}

	public static void main(String[] args) {
		MyContainer<String> container = new MyContainer<String>();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 5; j++) {
					System.out.println(container.get());
				}
			}, "c" + i).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 2; i++) {
			new Thread(() -> {
				for (int j = 0; j < 25; j++) {
					container.put(Thread.currentThread().getName() + " " + j);
				}
			}, "p" + i).start();
		}
	}

}

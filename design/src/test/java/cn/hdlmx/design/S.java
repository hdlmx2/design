package cn.hdlmx.design;

class A {
	private int i;

	public synchronized void m1() {
		System.out.println("method1 started");
		try {
			System.out.println("method1 execute");
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("mehtod1 end");
	}

	public  void m2() {
		
		try {
			for(;this.i<1000;) {
				i=i+1;
				System.out.println("当前线程："+Thread.currentThread().getName()+",i:" +i);
				Thread.sleep(10);
			}
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThyread extends Thread {
	private A a;
	

	public A getA() {
		return a;
	}


	public void setA(A a) {
		this.a = a;
	}


	@Override
	public void run() {
		a.m2();

	}
}

public class S {
	public static void main(String[] args) {
		A a=new A();
		MyThyread t1=new MyThyread();
		t1.setName("Threa-1");
		MyThyread t2=new MyThyread();
		t2.setName("Threa-2");
		t1.setA(a);
		t2.setA(a);
		t1.start();
		t2.start();

	}
}

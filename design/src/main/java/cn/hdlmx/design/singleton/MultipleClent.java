package cn.hdlmx.design.singleton;

public class MultipleClent {

	public static void main(String[] args) throws Exception {
		boolean same = true;
		while (same) {
			LazySingletonThread t1 = new LazySingletonThread();
			LazySingletonThread t2 = new LazySingletonThread();
			String t1String = t1.call();
			String t2String = t2.call();
			if (!t1String.equals(t2String)) {
				same = false;
			}
			System.out.println("t1:" + t1String);
			System.out.println("t2:" + t2String);
			Thread.sleep(1000);
		}

	}

}

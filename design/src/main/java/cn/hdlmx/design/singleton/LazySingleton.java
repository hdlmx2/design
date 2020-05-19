package cn.hdlmx.design.singleton;

/**
 * 懒汉类型单例模式
 * 
 * 没有做同步处理的不安全的单例模式
 */
public class LazySingleton {
	/* private static volatile LazySingleton instance = null; */
	private static volatile LazySingleton instance = null;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		// Thread.sleep(1000);
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;

	}

}

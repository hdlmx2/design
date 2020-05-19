package cn.hdlmx.design.singleton;

/**
 * 
 * 饿汉类型的单例模式 不存在线程安全的问题 
 * 饿汉模式的单例，首先在真整个程序启动的时候就进行实例化，而不是像懒汉模式，在第一次被调用的时候才进行实例化
 */
public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return instance;
	}
}

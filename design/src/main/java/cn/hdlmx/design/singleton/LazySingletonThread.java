package cn.hdlmx.design.singleton;

import java.util.concurrent.Callable;

public class LazySingletonThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		LazySingleton instance = LazySingleton.getInstance();
		return instance.toString();
	}

}

package cn.hdlmx.design.singleton;

public class Client {
	public static void main(String[] args) {
		HungrySingleton h1 = HungrySingleton.getInstance();
		HungrySingleton h2 = HungrySingleton.getInstance();
		if(h1==h2) {
			System.out.println("是同一个对象");
		}else {
			System.out.println("不是同一个对象");
		}
	}

}

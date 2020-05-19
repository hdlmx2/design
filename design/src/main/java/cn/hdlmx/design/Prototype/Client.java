package cn.hdlmx.design.Prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype r1 = new Realizetype();
		Realizetype r2 =(Realizetype) r1.clone();
	}

}

package cn.hdlmx.design.Prototype;

public class Realizetype implements Cloneable {
	public Realizetype() {
		System.out.println("原型对象创建成功");
	}

	/**
	 * 调用Cloneable的方法进行克隆
	 */
	public Object clone() throws CloneNotSupportedException {
		System.out.println("复制新的原型类成功！");
		return (Realizetype) super.clone();

	}

}

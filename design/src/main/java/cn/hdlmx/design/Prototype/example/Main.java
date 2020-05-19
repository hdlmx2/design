package cn.hdlmx.design.Prototype.example;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("原型模式测试");
		jFrame.setLayout(new GridLayout(1, 2));
		Container container = jFrame.getContentPane();
		WukongPrototype wk1 = new WukongPrototype();
		container.add(wk1);
		WukongPrototype wk2 = (WukongPrototype) wk1.clone();
		container.add(wk2);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

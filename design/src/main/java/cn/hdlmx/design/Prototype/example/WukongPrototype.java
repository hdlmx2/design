package cn.hdlmx.design.Prototype.example;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WukongPrototype extends JPanel implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WukongPrototype() {
		JLabel jLabel = new JLabel(new ImageIcon("image/Wukong.jpg"));
		this.add(jLabel);
	}

	public Object clone() {
		WukongPrototype wukong = null;
		try {
			wukong = (WukongPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("悟空复制失败");
			e.printStackTrace();
		}
		return wukong;

	}

}

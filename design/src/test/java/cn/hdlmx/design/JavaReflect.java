package cn.hdlmx.design;

import java.lang.reflect.Field;

import org.junit.Test;

public class JavaReflect {
	@Test
	public void reflectClass() {

		Class<?> stuClass = null;
		try {
			stuClass = Class.forName("cn.hdlmx.design.Student");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Field[] stuFields = stuClass.getDeclaredFields();
		Student student = new Student();
		System.out.println("====成员变量有====");
		for (Field field : stuFields) {
			// 获取成员变量的名称
			String fieldName = field.getName();
			// 获取成员变量类型
			Class<?> fieldClass = field.getType();
			System.out.println("成员变量名称：" + fieldName + "，类型：" + fieldClass);
			boolean isTurn = true;

			while (isTurn) {
				try {
					isTurn = false;
					if (fieldClass.equals(int.class)) {
						System.out.println("利用setInt方法修改成员变量的值");
						field.setInt(student, 100);
					} else if (fieldClass.equals(float.class)) {
						System.out.println("利用setFloat方法修改成员变量的值");
						field.setFloat(student, 20.4f);
					} else if (fieldClass.equals(boolean.class)) {
						System.out.println("利用setBoolean方法修改成员变量的值");
						field.setBoolean(student, true);
					} else {
						System.out.println("利用set方法设置成员变量的值");
						field.set(student, "张三");
					}
					System.out.println(field.get(student));
				}

				catch (Exception e) {
					System.out.println("在设置成员变量值时抛出异常，下面执行setAccessible()方法");
					field.setAccessible(true);
					isTurn = true;
					// e.printStackTrace();
				}
				System.out.println("=============================\n");

			}
		}
	}

}

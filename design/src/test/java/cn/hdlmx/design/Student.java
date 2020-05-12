package cn.hdlmx.design;

public class Student {
	//String name;
	private String password;
	protected int age;
	public float score;

	public void study(String content) {
		System.out.println(content);

	}

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [password=" + password + ", age=" + age + ", score=" + score + "]";
	}

	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", password=" + password + ", age=" + age + ", score=" + score + "]"; }
	 */
	

}

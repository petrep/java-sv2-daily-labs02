package day02;

public class Terminator {
	private String name;
	private int age;

	public Terminator(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String greetingSomebody(String name) {
		return "Hi " + name + ", my name is: " + this.name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}



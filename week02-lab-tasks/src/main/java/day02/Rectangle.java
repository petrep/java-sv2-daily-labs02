package day02;

public class Rectangle {
	private float sideA;
	private float sideB;

	public Rectangle(float sideA, float sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public float calculateArea() {
		return sideA * sideB;
	}
}

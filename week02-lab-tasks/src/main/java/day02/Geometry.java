package day02;

public class Geometry {
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(3.1f, 4.2f);

		float area = myRectangle.calculateArea();
		System.out.println(" area = " + area);
	}
}

package day02;

import java.util.Scanner;

public class ChatBot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Terminator arni = new Terminator("Termi", 12);

		System.out.println("Kérem a nevet:");
		String guest = scanner.nextLine();

		System.out.println(arni.greetingSomebody(guest));
		System.out.println(arni.greetingSomebody("valaki"));
	}
}

package day04.day04;

import day04.Car;

public class GasStation {
	private int gasPrice = 500;

	public int loadFuel(Car myCar, int gasLiter) {
		int payment = 0;
		myCar.setGas(gasLiter);
		payment = gasLiter * gasPrice;
		System.out.println("Gas price: " + payment);
		return payment;
	}

	public GasStation(int gasPrice) {
		this.gasPrice = gasPrice;
	}
}

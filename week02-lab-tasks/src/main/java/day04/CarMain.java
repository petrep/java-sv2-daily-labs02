package day04;

import day04.day04.GasStation;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		GasStation gasStation = new GasStation(500);

		System.out.println(myCar.averageConsumptionPer100Km(40,200));
		System.out.println("Loading fuel: " + gasStation.loadFuel(myCar,20));
	}
}

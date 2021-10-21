package day04;

public class Car {
	public int gas;
	public int distance;

	public void setGas(int gas) {
		this.gas = gas;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double averageConsumptionPer100Km(int gas, int distance) {
		double usedGas = 0.0;
		usedGas = (100.0 / distance) * gas;
		return usedGas;
	}
}

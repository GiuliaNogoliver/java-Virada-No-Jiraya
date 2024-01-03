package oop.composition.oneToOne;

public class Engine {

	final Car car;
	boolean on = false;
	double injectionFactor = 1;

	Engine(Car car){
		this.car = car;
	}
	int spins() {
		return (int) Math.round(injectionFactor * 3000);
	}
}

package br.com.oop.composition;

public class Engine {

	Car car;
	boolean on = false;
	double injectionFactor = 1;

	Engine(Car car){
		this.car = car; 
	}
	int spins() {
		return (int) Math.round(injectionFactor * 3000);
	}
}

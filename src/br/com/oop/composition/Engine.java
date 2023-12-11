package br.com.oop.composition;

public class Engine {
	Car car;
	boolean on = false;
	double injectionFactor = 1;

	int spins() {
		if(!on) {
			return (int) Math.round(injectionFactor * 3000);
		} else {
			return 0;
		}
	}
}

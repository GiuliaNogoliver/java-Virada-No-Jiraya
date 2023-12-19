package br.com.oop.inheritance.challenge;

public class Car {

	double velocity = 0;
	final int MAX_VELOCITY;
	int delta = 5;

	Car(int MAX_VELOCITY) {
		this.MAX_VELOCITY = MAX_VELOCITY;
	}

	void speed() {
		if (velocity + delta > MAX_VELOCITY) {
			velocity = MAX_VELOCITY;
		} else {
			velocity += delta;
		}
	}

	void breaker() {
		if (velocity >= delta) {
			velocity -= delta;
		} else {
			System.out.println("O carro já esta parado");
		}
	}

	public String toString() {
		return "A velocity do carro está em " + velocity + " Km/h";
	}
}

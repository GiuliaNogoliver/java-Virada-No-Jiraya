package br.com.oop.inheritance.challenge;

public class Car {

	protected double velocity = 0;
	public final int MAX_VELOCITY;
	private int delta = 5;

	Car(int MAX_VELOCITY) {
		this.MAX_VELOCITY = MAX_VELOCITY;
	}

	public void speed() {
		if (velocity + delta > MAX_VELOCITY) {
			velocity = MAX_VELOCITY;
		} else {
			velocity += delta;
		}
	}

	public void breaker() {
		if (velocity >= delta) {
			velocity -= delta;
		} else {
			System.out.println("O carro já esta parado");
		}
	}

	public String toString() {
		return "A velocity do carro está em " + velocity + " Km/h";
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}

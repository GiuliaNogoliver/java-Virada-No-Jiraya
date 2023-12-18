package br.com.oop.inheritance.challenge;

public class Car {
	
	double velocity = 0;
	
	void speed() {
		if(velocity >= 0 && velocity <  100) {
			velocity += 5;
		} else {
			velocity = 0;
		}
	}
	
	void breaker() {
		if(velocity >= 5) {
			velocity -= 5;
		} else {
			System.out.println("O carro já esta parado");
		}
	}
	
	public String toString() {
		return "A velocity do carro está em " + velocity + " Km/h";
	}
}

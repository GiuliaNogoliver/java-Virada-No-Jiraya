package br.com.oop.composition.oneToOne;

public class TestCar {
	public static void main(String[] args) {
		Car car01 = new Car();

		System.out.println(car01.isOn());
		car01.powerOn();
		System.out.println(car01.isOn());
		System.out.println(car01.engine.spins());
		
		car01.accelerate();
		car01.accelerate();
		car01.accelerate();
		car01.accelerate();
		car01.accelerate();
		car01.accelerate();
		car01.accelerate();
		System.out.println(car01.engine.spins());
		
		car01.stop();
		car01.stop();
		car01.stop();
		System.out.println(car01.engine.spins());
		
		// Faltou Encapsulamento
		// car01.engine.injectionFactor = -30;
		System.out.println(car01.engine.spins());
		
		// Relaçao bidimencional
		car01.engine.car.engine.car.engine.spins();
	}
}

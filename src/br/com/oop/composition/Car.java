package br.com.oop.composition;

public class Car {

	Engine engine;
	// acelera
	// freia
	// liga
	// desliga
	// o carro possui um motor

	void accelerate() {
		engine.spins();
	}

	void decelerate() {
		engine.spins();
	}
}

package br.com.oop.composition.oneToOne;

public class Car {

	final Engine engine;
	
	Car(){
		this.engine = new Engine(this);
	}

	void accelerate() {
		if (engine.injectionFactor < 2.5) {
			engine.injectionFactor += 0.4;
		}
	}

	void stop() {
		if (engine.injectionFactor > 0.5) {
			engine.injectionFactor -= 0.4;
		}
	}

	void powerOn() {
		engine.on = true;
	}

	void powerOff() {
		engine.on = false;
	}

	boolean isOn() {
		return engine.on;
	}
}

package br.com.oop.composition;

public class Car {

	Engine engine;
	
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

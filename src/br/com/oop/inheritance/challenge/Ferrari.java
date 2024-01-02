package br.com.oop.inheritance.challenge;

public class Ferrari extends Car implements Sport, Lux {

	public boolean arLigado = false;

	public Ferrari() {
		super(340);
	}

	public Ferrari(int MAX_VELOCITY) {
		super(MAX_VELOCITY);
	}
	// delta = 15;

	// Anotacao de q esta sobreescrevendo
	@Override
	public void speed() {
		velocity += delta;
	}

	@Override
	public void ligarTurbo() {
		setDelta(25);
	}

	@Override
	public void desligarTurbo() {
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		arLigado = true;
		setDelta(delta - 5);
	}

	@Override
	public void desligarAr() {
		arLigado = false;
		if (arLigado = false) { //assim eu so aumento e abaixo a velocidade 1x
			setDelta(delta + 5);
		}
	}
}

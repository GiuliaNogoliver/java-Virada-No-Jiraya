package oop.inheritance.challenge;

public class Ferrari extends Car implements Sport, Lux {

	private boolean arLigado = false;
	private boolean turboLigado = false;

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
		velocity += getDelta();
	}

	@Override
	public void ligarTurbo() {
		turboLigado = true;
		if (!turboLigado) {
			setDelta(25);
		}
	}

	@Override
	public void desligarTurbo() {
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		setArLigado(true);
		setDelta(getDelta() - 5);
	}

	@Override
	public void desligarAr() {
		setArLigado(false);
		if (setArLigado(false)) { // assim eu so aumento e abaixo a velocidade 1x
			setDelta(getDelta() + 5);
		}
	}

	public boolean isArLigado() {
		return arLigado;
	}

	public boolean setArLigado(boolean arLigado) {
		this.arLigado = arLigado;
		return arLigado;
	}

	public boolean isTurboLigado() {
		return turboLigado;
	}

	public void setTurboLigado(boolean turboLigado) {
		this.turboLigado = turboLigado;
	}
}

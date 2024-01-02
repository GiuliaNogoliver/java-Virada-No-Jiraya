package br.com.oop.polymorphism;

// A classe abstrata nao pode instanciar objetos
public abstract class Comida {
	private double peso;
	
	// ou seja esse construtor nao é usado
	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso(){
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}

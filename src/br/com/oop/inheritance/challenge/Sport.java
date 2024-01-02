package br.com.oop.inheritance.challenge;

public interface Sport {

	// A interface serve para dizer que a classe terá x metodos mas cada um treá sua
	// implementacao

	// por padrão todo metódo dentro da interface é publico mesmo nao declarando
	void ligarTurbo();

	// além de que o metódo é abstract pois não possui corpo, logo não possuí
	// chaves{}
	public abstract void desligarTurbo();

}

package br.com.oop.inheritance.challenge;

public interface Sport {
	
	// por padrão todo metódo dentro da interface é publico mesmo nao declarando
	void ligarTurbo();
	// além de que o metódo é abstract pois não possui corpo, logo não possuí chaves{}
	public abstract void desligarTurbo();
	
}

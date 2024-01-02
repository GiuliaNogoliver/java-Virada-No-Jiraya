package br.com.oop.inheritance.challenge;

public interface Lux {

	public void ligarAr();

	abstract void desligarAr();

	// qnd ja cria o corpo na classe abstrata nao precisa fazer-lo em ferrari
	default int airLevel() {
		return 1;
	}
}
package br.com.oop.abstracto;

public abstract class Mammal extends Animal {

	// Na classe abstrata eu defino de forma abstrata os comportamentos que devem
	// ser implementados
	@Override
	public String mover() {
		return "Saindo do lugar";
	}

	public abstract String mamar();
}

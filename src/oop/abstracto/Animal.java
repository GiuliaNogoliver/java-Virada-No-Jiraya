package oop.abstracto;

public abstract class Animal {
	// o metodo final nao pode ser sobreescrito nas sub-classes
	public final String respirar() {
		return "Usando Oxigênio";
	}
	
	public abstract String mover();
	
}

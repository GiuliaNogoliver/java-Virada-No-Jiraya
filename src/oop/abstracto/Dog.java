package oop.abstracto;

public class Dog extends Mammal {
	
	// nas classes concretas define todos os comportamentos
	// pode implementar tbm comportamentos abstratos
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
}

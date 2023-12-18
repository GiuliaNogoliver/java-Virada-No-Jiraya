package br.com.oop.inheritance.usingEnum;

public class Heroi extends Player {

	Heroi(String name) {
		super(name);
	}

	// Para sobreescrever um metodo vc pode colar ele inteiro aqui ou usar o Super
	boolean atacar(Player oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
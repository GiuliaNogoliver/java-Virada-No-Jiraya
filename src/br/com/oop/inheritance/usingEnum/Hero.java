package br.com.oop.inheritance.usingEnum;

public class Hero extends Player {

	Hero(int x, int y) {
		super(x, y);
	}

	Hero(String name) {
		super(name);
	}

	// Para sobreescrever um metodo vc pode colar ele inteiro aqui ou usar o Super
	boolean attack(Player oponente) {
		boolean attack1 = super.attack(oponente);
		boolean attack2 = super.attack(oponente);
		boolean attack3 = super.attack(oponente);
		return attack1 || attack2 || attack3;
	}
}
package br.com.oop.inheritance.usingEnum;

public class Jogador {
	String name;
	int x;
	int y;
	
	Jogador(String name){
		this.name = name;
	}
	
	void andarCasas(Direcao direcao) {
		if(direcao == Direcao.LESTE) {
			x++;
		} else if(direcao == Direcao.OESTE) {
			x--;
		} else if (direcao == Direcao.SUL) {
			y--;
		} else if (direcao == Direcao.NORTE) {
			y++;
		} else {
			System.out.println("Direçao inválida");
		}
	}
}

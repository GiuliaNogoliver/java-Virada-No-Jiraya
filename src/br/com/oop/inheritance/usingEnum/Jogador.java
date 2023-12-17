package br.com.oop.inheritance.usingEnum;

import java.util.Arrays;

public class Jogador {
	String name;
	int x;
	int y;
    int[] posicaoAtual;

    Jogador(String name) {
        this.name = name;
        this.posicaoAtual = new int[2];
        this.posicaoAtual[0] = this.x;
        this.posicaoAtual[1] = this.y;
    }

	void andarCasas(Direcao direcao) {
		if (direcao == Direcao.LESTE) {
			x++;
		} else if (direcao == Direcao.OESTE) {
			x--;
		} else if (direcao == Direcao.SUL) {
			y--;
		} else if (direcao == Direcao.NORTE) {
			y++;
		} else {
			System.out.println("Direçao inválida");
		}
        posicaoAtual[0] = x;
        posicaoAtual[1] = y;
	}
	
	String exibirMatriz() {
		return Arrays.toString(posicaoAtual);
	}
	/*
	 * public String toString() { for (int[] posicaoAtual : posicaoAtual) { return
	 * System.out.println(Array.toString(posicaoAtual)); } return ""; }
	 */
}

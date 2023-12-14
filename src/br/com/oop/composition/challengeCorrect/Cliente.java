package br.com.oop.composition.challengeCorrect;

import java.util.ArrayList;

public class Cliente {
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}

	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
}

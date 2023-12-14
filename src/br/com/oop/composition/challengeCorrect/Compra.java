package br.com.oop.composition.challengeCorrect;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int quatidade) {
		this.itens.add(new Item(p, quatidade));
	}

	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtd));
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
			return total;
		}
		return 0;
	}
}

package br.com.oop.composition.challenge;

import java.util.ArrayList;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item(String name, int quantidade, double preco){
		this.nome = name;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	ArrayList<Produto> itens = new ArrayList<>();
	
	void adicionarProduto(Produto produto) {
		itens.add(produto);
	}
	
	public String toString() {
		return nome;
	}
}

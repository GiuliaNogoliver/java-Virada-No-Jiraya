package oop.composition.challenge;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Object object) {
		this.itens.add((Item) object);
	}
	
	double valorTotalCompra () {
		for(Item itens : itens) {
			double total =+ itens.preco;
			return total;
		}
		return 0;
	}
}

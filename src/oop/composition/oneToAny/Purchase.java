package oop.composition.oneToAny;

import java.util.ArrayList;

public class Purchase {
	String client;

	// Uma compra tem muitos itens
	ArrayList<Item> itens = new ArrayList<Item>();

	void addItem(Item item) {
		itens.add(item);
		item.purchase = this;
	}
	
	void addItem(String name, int amount, double price) {
		this.addItem(new Item(name, amount, price));
	}
	
	double totalPrice() {
		double total = 0;
		for (Item item : itens) {
			total += item.amount * item.price;
		}
		return total;
	}

}

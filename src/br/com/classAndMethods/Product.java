package br.com.classAndMethods;

public class Product {
	String name;
	double price;
	static double discount = 0.25;

	// esse já é default
	public Product() {
		
	}
	// quando eu deixo sò esse, o default nao valerá, ou seja quando eu der um new
	// Product() sem parametro ele nao vai aceitar
	Product(String inicialName) {
		name = inicialName;
	}

	Product(String inicialName, double inicialPrice) {
		name = inicialName;
		price = inicialPrice;
	}

	double priceWithDiscout() {
		double newPrice = price - (1 * discount);
		return newPrice;
	}

	double priceWithDiscout(double manangerDiscount) {
		double newPrice = price - (1 * discount + manangerDiscount);
		return newPrice;
	}
}

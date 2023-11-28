package br.com.classe.product;

public class Product {
	String name;
	double price;
	double discount;
	
	double priceWithDiscout() {
		double newPrice = price - (1 * discount);
		return newPrice;
	}
	double priceWithDiscout(double manangerDiscount) {
		double newPrice = price - (1 * discount + manangerDiscount);
		return newPrice;
	}
}

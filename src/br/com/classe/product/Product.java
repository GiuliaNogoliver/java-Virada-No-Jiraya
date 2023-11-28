package br.com.classe.product;

public class Product {
	String name;
	double price;
	double discount;
	
	Product(){
		
	}
	Product(String inicialName){
		name = inicialName;
	}
	Product(String inicialName, double inicialPrice){
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

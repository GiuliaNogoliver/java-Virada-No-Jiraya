package classAndMethods;

public class Product {
	String name;
	double price;
	// O metodo estico pode além de ser um unico valor para a classe toda
	// pode ser tbm ser chamado sem criar uma instancia da classe
	static double discount = 0.25;

	// esse já é default
	public Product() {
		
	}
	// quando eu deixo sò esse, o default nao valerá, ou seja quando 
	// eu der um new Product() sem parametro ele nao vai aceitar
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

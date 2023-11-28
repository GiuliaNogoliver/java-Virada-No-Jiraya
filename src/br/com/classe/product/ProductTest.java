package br.com.classe.product;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "Notebook";
		p1.price = 4360.60;
		p1.discount = 0.15;
		
		var p2 = new Product();
		p2.name = "Macbook";
		p2.price = 4200.20;
		p2.discount = 0.30;
		
		double finalPrice1 = p1.price * (1 - p1.discount);
		double finalPrice2 = p2.price * (1 - p2.discount);
		
		System.out.printf("No seu carrinho vc tem um %s no valor de R$%.2f com desconto aplicado",p1.name, finalPrice1);
		System.out.printf("\nNo seu carrinho vc tem um %s no valor de R$%.2f com desconto aplicado",p2.name, finalPrice2);
	}
}
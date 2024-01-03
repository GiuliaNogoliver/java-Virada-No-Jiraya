package oop.composition.oneToAny;

public class PurchaseTest {
	public static void main(String[] args) {
		//adicionar itens
		//ver o total de itens
		//ver o total de preco
		
		Purchase purchase = new Purchase();
		purchase.client = "Giulia";
		purchase.addItem(new Item("Batata", 3, 6.50));
		purchase.addItem(new Item("Beterraba", 1, 1.23));
		
		System.out.println(purchase.itens.size());
		
		System.out.println(purchase.totalPrice());
		
		// Relaçao bidirecional
		double total = purchase.itens.get(0).purchase.itens.get(1).purchase.totalPrice();
		System.out.println(total);
	}
}

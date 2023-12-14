package br.com.oop.composition.challenge;

public class ClienteTest {
	// adicionar 5 itens cada um com 2 marcas diferentes
	//	obter valor total da compra
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Giulia");
		
		cliente1.compra.adicionarItem(new Item("Shampoo",1, 6.50));
		cliente1.compra.adicionarItem(new Item("Condicionador",2, 7.80));
		
		System.out.println(cliente1.compra.itens.get(0).toString());
		
		//cliente1.compra.adicionarItem(new Item("Condicionador",1).adicionarProduto(new Produto("Seda", 6.50)));
		
		System.out.println(cliente1.compra.valorTotalCompra());
		 
	}
} 

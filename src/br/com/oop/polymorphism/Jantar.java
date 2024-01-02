package br.com.oop.polymorphism;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa("Giulia", 50);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.3);
		Sorvete sobremesa = new Sorvete(0.5);
		Comida ingrediante3 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediante3);
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}
}

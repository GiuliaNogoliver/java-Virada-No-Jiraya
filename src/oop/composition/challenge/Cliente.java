package oop.composition.challenge;

public class Cliente {
	final String nomeCliente;
	Compra compra = new Compra();
	
	Cliente(String nome){
		this.nomeCliente = nome;
	}
	
}

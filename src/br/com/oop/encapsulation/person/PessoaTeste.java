package br.com.oop.encapsulation.person;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Giulia", "Oliveira", 21);
		
		System.out.println(p1.lerIdade());
		p1.alterarIdade(20);
		System.out.println(p1.lerIdade());
		p1.alterarIdade(-21);
		System.out.println(p1.lerIdade());
		
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());
	}
}

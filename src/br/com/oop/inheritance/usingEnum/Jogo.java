package br.com.oop.inheritance.usingEnum;

public class Jogo {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Giulia");

		jogador1.andarCasas(Direcao.NORTE);
		jogador1.andarCasas(Direcao.NORTE);
		jogador1.andarCasas(Direcao.LESTE);
		jogador1.andarCasas(Direcao.LESTE);

		System.out.println(jogador1.x);
		System.out.println(jogador1.y);
		System.out.println(jogador1.exibirMatriz());
		
	}
}

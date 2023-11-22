package br.com.challenge;

import java.util.Random;
import java.util.Scanner;

public class Challenge06 {
	public static void main(String[] args) {
		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */
		Scanner entrada = new Scanner(System.in);

		Random random = new Random();
		int numAleatorio = random.nextInt(100) + 1;

		System.out.println("Tente acertar um numero de 0 a 100, vc tem 10 tentativas");

		for (int i = 10; i > 1; i--) {
			System.out.printf("Voce tem %d tentativas", i);
			int tentativa = entrada.nextInt();

			if (tentativa == numAleatorio) {
				System.out.printf("Parabéns o número é %d", numAleatorio);
				break;
				
			} else if (tentativa != numAleatorio) {
				if(i > 1) {
					System.out.println("Tente novamente");	
				} else {
					System.out.println("Suas tentativas acabaram");
				}
			}

		}

		entrada.close();
	}
}

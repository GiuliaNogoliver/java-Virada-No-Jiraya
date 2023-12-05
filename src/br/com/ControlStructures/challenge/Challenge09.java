package br.com.controlStructures.challenge;

import java.util.Scanner;

public class Challenge09 {
	public static void main(String[] args) {
		/*
		 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 10 números");
		
		int valor = 0;
		int maiorValor = 0;
		int contador = 0;
		
		do {
			valor = entrada.nextInt();
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
		} while (contador < 10);
		
		System.out.println("O maior valor digitado foi " + maiorValor);
		entrada.close();
	}
}

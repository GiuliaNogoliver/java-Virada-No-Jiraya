package br.com.controlStructures.challenge;

import java.util.Scanner;

public class Challenge07 {
	public static void main(String[] args) {
		/*
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int a = 0;
		int b = 0;

		while (a >= 0) {
			a = entrada.nextInt();
			if(a > 0) {
				b += a;
			}else {
				break;
			}
			System.out.println(b);
		}
		entrada.close();
	}
}

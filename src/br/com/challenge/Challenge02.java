package br.com.challenge;

import java.util.Scanner;

public class Challenge02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano:");
		int ano = entrada.nextInt();

		if (ano % 4 == 0) {
			System.out.printf("O ano %d é bissexto", ano);
		} else {
			System.out.println("O ano informado nao è bissexto");
		}

		entrada.close();
	}
}

package br.com.controlStructures;

import java.util.Scanner;

public class Notes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int qtdNotas = 0;
		double nota = 0;
		double total = 0;

		System.out.println("Digite a NOTA:");
		System.out.println("Digite -1 para sair.");
		
		while (nota != -1) {
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				qtdNotas++;
			} else if (nota != -1) {
				System.out.println("Nota Inválida!");
			}
		}

		double media = total / qtdNotas;
		System.out.print("A média da sala é de " + media);
		entrada.close();

	}
}

package br.com.challenge;

import java.util.Scanner;

public class Challenge03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota parcial:");
		double notaParcial = entrada.nextDouble();
		
		if (notaParcial < 0 || notaParcial > 10) {
			System.out.println("Nota inválida");
		}
		System.out.println("Digite a segunda nota parcial:");
		double notaParcial2 = entrada.nextDouble();
		if (notaParcial2 < 0 || notaParcial2 > 10) {
			System.out.println("Nota inválida");
		}
		double total = notaParcial + notaParcial2;
		
		if(total >= 7) {
			System.out.println("Aprovado");
		} else if (total < 7 && total >= 4 ) {
			System.out.println("Recuperaçao");
		} else if (total < 4) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}

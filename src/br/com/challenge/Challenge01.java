package br.com.challenge;

import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero");
		double num = entrada.nextDouble();
		
		if(num > 0 && num < 10 && num % 2 == 0) {
			System.out.printf("O numero %.2f é menor que 10 e maior que 0"
					+ " e é par", num);
		} else {
			System.out.println("O numero digitado nao é inteiro ou par");
		}
		entrada.close();
	}
}

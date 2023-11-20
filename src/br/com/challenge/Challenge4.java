package br.com.challenge;

import java.util.Scanner;

public class Challenge4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número:");
		double num = entrada.nextDouble();
		
		if(num % 2 != 0 && num / num == 1) {
			System.out.println("é um número primo");
		}else {
			System.out.println("O numero nao é primo");
		}
		
		entrada.close();
	}
}

package br.com.challenge;

import java.util.Scanner;

public class Challenge5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero");
		int num = entrada.nextInt();
		
		boolean primo = num % 2 != 0 && num/num == 1;
		
		int i = 1;
		
		if(primo == false) {
			i = 1;
		} else {
			i = 0;
		}
		
		switch(i) {
		case 0:
			System.out.println("O nùmero é primo");
			break;
		case 1:
			System.out.println("O nùmero nao é primo");
		}
		
		
		entrada.close();
	}
}

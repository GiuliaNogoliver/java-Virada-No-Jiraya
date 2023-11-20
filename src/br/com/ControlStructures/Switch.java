package br.com.controlStructures;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade = entrada.nextInt();
		
		switch(idade) {
		case 3 : 
			System.out.println("Sabe programar");
		case 2 : 
			System.out.println("Sabe comer");
		case 1 :
			System.out.println("Sabe chorar");
		}
		
		entrada.close();
	}
}

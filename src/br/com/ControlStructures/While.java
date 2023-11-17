package br.com.controlStructures;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String variavel = "";
		while(!variavel.equalsIgnoreCase("sair")) {
			System.out.println("Digite o comando:");
			variavel = entrada.nextLine();
		}
		System.out.println("Sair");
		entrada.close();
	}
}

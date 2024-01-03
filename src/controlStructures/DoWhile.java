package controlStructures;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String variavel = "";
		do {
			System.out.println("Digite a palavra mágica para sair");
			variavel = entrada.nextLine();
		} while (!variavel.equalsIgnoreCase("por favor"));
		entrada.close();
		System.out.println("Você saiu!");
	}
}

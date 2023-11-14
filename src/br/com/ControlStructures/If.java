package br.com.controlStructures;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = entrada.nextDouble();
		
		if(nota >= 7) {
			System.out.println("Aluno aprovado");
		}
		if(nota < 7 && nota >= 5) {
			System.out.println("Aluno de recuperaçao");
		}
		boolean reprovado = nota < 5;
		if(reprovado){
			System.out.println("Aluno reprovado");
		}
		entrada.close();
	}
}

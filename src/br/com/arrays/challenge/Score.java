package br.com.arrays.challenge;

import java.util.Scanner;

public class Score {
	/*
	 *Requisitos:
	 *O usuario informa quantas notas serao
	 *o usuario informa quais sao as notas
	 *usando for-each ele soma e mostra a media
	 *
	 *primeiro salve as info num array informando os indices
	 *
	 *segundo faça a logica de soma da nota
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantas notas serao");
		double[] notas = new double[entrada.nextInt()];

		System.out.println(notas.length);
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Infome a nota");
			notas[i] += entrada.nextDouble();
		}

		for(int y = 0; y < notas.length; y++) {
			notas[y] += notas[y];
		}
		
		int b = notas.length;
		System.out.println(notas[0]);
		System.out.println(b);
		System.out.println(notas[0]/b);
		
		
		entrada.close();
	}
}

package br.com.arrays.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	/*
	 * Requisitos: O usuario informa quantas notas serao o usuario informa quais sao
	 * as notas usando for-each ele soma e mostra a media
	 *
	 * primeiro salve as info num array informando os indices
	 *
	 * segundo faça a logica de soma da nota
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantas notas serao");
		double[] notas = new double[entrada.nextInt()];

		System.out.println(notas.length);

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Infome a nota " + (i + 1) + ": ");
			notas[i] += entrada.nextDouble();
		}

		// Lib de Array
		System.out.println("Suas notas informadas sao: " + Arrays.toString(notas));

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		System.out.println(total / notas.length);

		/*
		 * double totalTest = 0; for(int y = 0; y < notas.length; y++) { totalTest +=
		 * notas[y]; } System.out.println(totalTest/notas.length);
		 */

		entrada.close();
	}
}

package br.com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de alunos ? ");
		int qntAlunos = entrada.nextInt();

		System.out.println("Qual a quantidade de notas? ");
		int qntNotas = entrada.nextInt();
		
		
		double[][] notasTurma = new double[qntAlunos][qntNotas];
		
		/*
		 * O laço começa com o primerio for que usa a variavel "i" para acessar as linhas da 
		 * matriz ou seja, o .lenght refere-se ao número de linhas na matriz bidimensional.
		 */
		for(int i = 0; i < notasTurma.length; i++) {
			/*
			 *Nesse segundo for ele usa a variavel "j" para acesar as colunas da matriz usando
			 *a linha referenciada "i", ou seja notasTurma[i].length refere as colunas da linha
			 * atual (representada por i). 
			 */
			for(int j = 0; j < notasTurma[i].length; j++) {
				System.out.println("Insira a nota " + (j + 1) + " do aluno "
						+ "" + (1 + i));
				notasTurma[i][j] += entrada.nextDouble();
			}
		}
		
		System.out.println(Arrays.toString(notasTurma));
		
		entrada.close();
	}
}

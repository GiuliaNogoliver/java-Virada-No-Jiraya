package br.com.elementary.challenge;

import java.util.Scanner;

		//apartir do scanner, 3 strings usando nextline
		//vao receber 3 salaroios e calcular a media
		//flexibilidade de usar os pontos flutuantes
		//o funcionario consegue colocar 3 valores com virgula
		
public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Qual seu primeiro salario?");
		String salario01 = salario.nextLine().replace(",",".");
		
		System.out.println("Qual seu segundo salario?");
		String salario02 = salario.nextLine().replace(",",".");
		
		System.out.println("Qual seu terceiro salario?");
		String salario03 = salario.nextLine().replace(",",".");
		
		salario.close();
		
		double salario1Number = Double.parseDouble(salario01);
		double salario2Number = Double.parseDouble(salario02);
		double salario3Number = Double.parseDouble(salario03);
		
		double media = (salario1Number+salario2Number+salario3Number)/3;
		
		System.out.print("Sua média salarial é igual a " + media);
		
	}
}

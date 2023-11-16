package br.com.controlStructures;

import javax.swing.JOptionPane;

public class Week {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite o dia da semana:");

		if (entrada.equals("segunda")) {
			System.out.println(1);
		} else if (entrada.equalsIgnoreCase("terça") || entrada.equalsIgnoreCase("terca")) {
			System.out.println(2);
		} else if (entrada.equalsIgnoreCase("quarta")) {
			System.out.println(3);
		} else if (entrada.equals("quinta")) {
			System.out.println(4);
		} else if (entrada.equals("sexta")) {
			System.out.println(5);
		} else if (entrada.equals("sabado")) {
			System.out.println(6);
		} else if (entrada.equals("domingo")) {
			System.out.println(7);
		}
	}
}

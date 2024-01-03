package controlStructures;

import javax.swing.JOptionPane;

public class Week {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite o dia da semana:");
		String dia = entrada;
		
		if (entrada.equals("segunda")) {
			System.out.println(1);
		} else if (entrada.equalsIgnoreCase("terça") 
				|| entrada.equalsIgnoreCase("terca")) {
			System.out.println(2);
		} else if ("quarta".equals(dia.toLowerCase())) {
			System.out.println(3);
		} else if (entrada.equalsIgnoreCase("quinta")) {
			System.out.println(4);
		} else if (entrada.equalsIgnoreCase("sexta")) {
			System.out.println(5);
		} else if (entrada.equalsIgnoreCase("sabado")) {
			System.out.println(6);
		} else if (entrada.equalsIgnoreCase("domingo")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!!");
		}
	}
}

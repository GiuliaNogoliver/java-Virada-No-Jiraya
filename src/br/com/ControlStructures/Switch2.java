package br.com.controlStructures;

import javax.swing.JOptionPane;

public class Switch2 {
	public static void main(String[] args) {

		String faixa = JOptionPane.showInputDialog("Qual sua faixa?");

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heinan Nidan");
		case "amarela":
			System.out.println("Sei o Heinan Shodan");
			break;
		default:
			System.out.println("Nao sei nada");
		}
	}
}

package br.com.elementary;

import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		
		//using scanner and JPotionPane
		
		String entradaJP1 = JOptionPane.showInputDialog("Insira o primeiro numero");
		double num1 = Double.parseDouble(entradaJP1);

		String entradaJP2 = JOptionPane.showInputDialog("Insira o primeiro numero");
		double num2 = Double.parseDouble(entradaJP2);

		String entradaJP3 = JOptionPane.showInputDialog("Insira a operaçao");
		String operacao = entradaJP3;
		
		double resultado = operacao.equals("+") ? num1 + num2 : 0;
		resultado = operacao.equals("-") ? num1 - num2 : resultado;
		resultado = operacao.equals("*") ? num1 - num2 : resultado;
		resultado = operacao.equals("/") ? num1 - num2 : resultado;
		resultado = operacao.equals("%") ? num1 - num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o segundo numero:");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operaçao:");
		String operacao = entrada.next();
		
		double resultado = operacao.equals("+") ? num1 + num2: 0;
		resultado = operacao.equals("-") ? num1 - num2 : resultado;
		resultado = operacao.equals("*") ? num1 * num2 : resultado;
		resultado = operacao.equals("/") ? num1 / num2 : resultado;
		resultado = operacao.equals("%") ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado );
		entrada.close();*/
		
	}
}

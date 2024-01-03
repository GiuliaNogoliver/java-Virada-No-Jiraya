package elementary;

import javax.swing.JOptionPane;

public class StringToNumber {
	public static void main(String[] args) {
		String value01 = JOptionPane.showInputDialog(
				"Type the first number");
		
		String value02 = JOptionPane.showInputDialog(
				"Type the second number");
		
		System.out.println(value01 + value02);
		
		double number1 = Double.parseDouble(value01);
		double number2 = Double.parseDouble(value02);
		
		double soma = number1 + number2;
		System.out.println("A soma é " + soma);
		double media = soma/2;
		System.out.println("A media é " + media);
		
		//BigDecimal da um resultado preciso das casas decimais
	}
}
package elementary.challenge;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuário 
		//e imprima no console o IMC.
		String entradaAltura = JOptionPane.showInputDialog("Qual sua altura em metros separado por virgula?");
		double altura = Double.parseDouble(entradaAltura.replace(",","."));
		
		String entradaPeso = JOptionPane.showInputDialog("Qual seu peso em kg?");
		double peso = Double.parseDouble(entradaPeso);
		
		double imc = peso / (altura * altura);
		
		DecimalFormat df = new DecimalFormat("#,#");
		String imcFormatado = df.format(imc);
		
		JOptionPane.showMessageDialog(null,"Seu IMC é igua á " + imcFormatado);
	}
}

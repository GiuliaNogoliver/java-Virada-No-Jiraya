package br.com.lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Soma();
		System.out.println(soma.calcular(2, 3));
		
		Calculo multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.calcular(2, 3));
		
	}
}

package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		// <Tipo de dado de parametro de entrada, tipo de dado de saida>
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(822));

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";
		Function<String, String> duvida = valor -> valor + "???";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(45);
		System.out.println(resultadoFinal);

		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(46);
		System.out.println(resultadoFinal2);
	}
}
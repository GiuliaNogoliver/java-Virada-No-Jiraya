package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorr {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(8.2, 6.9));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double result = (n1 + n2)/2;
			return result >= 6 ? "Aprovado" : "Reprovado";
			};
		System.out.println(resultado.apply(8.3, 5.5));
		
		Function<Double, String> conceito = m -> m >= 6.5 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(2.8, 10.0));
	}
}

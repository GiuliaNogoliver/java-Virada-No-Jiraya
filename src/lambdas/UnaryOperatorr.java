package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorr {
	public static void main(String[] args) {
		UnaryOperator<Integer> multiplicacao2 = num -> num * 2;
		UnaryOperator<Integer> multiplicacao3 = num -> num * 3;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;

		int resultado = multiplicacao2
						.andThen(multiplicacao3)
						.andThen(aoQuadrado)
						.apply(2);
		System.out.println(resultado);
		
		int resultado2 = aoQuadrado
						.compose(multiplicacao2)
						.compose(multiplicacao3)
						.apply(3);
		System.out.println(resultado2);
	}
}

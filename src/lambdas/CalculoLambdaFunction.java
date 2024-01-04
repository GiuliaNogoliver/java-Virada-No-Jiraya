package lambdas;

import java.util.function.BinaryOperator;

public class CalculoLambdaFunction {
	public static void main(String[] args) {

		// A interface do operador pode ser usada do java.util.function uma interface
		// funcional ja definida pelo java

		/*
		 * onde o generics pode ter Interface BiFunction<T,U,R> Type Parameters: T - the
		 * type of the first argument to the function U - the type of the second
		 * argument to the function R - the type of the result of the function
		 */
		BinaryOperator<Integer> soma = (x, y) -> {
			return x + y;
		};
		System.out.println(soma.apply(2, 3));
	}
}

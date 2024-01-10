package lambdas;

import java.util.function.Predicate;

// composicao de funcoes

public class Predicate2 {
	public static void main(String[] args) {
		//  ideia aqui é usar operadores logicos para validar
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num <= 100 && num >= 999;
		
		// e quando testar usar as duas funcoes na mesma validacao
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isTresDigitos.test(23));
		
	}
}

package lambdas;

import java.util.function.Predicate;

// Predicate #1
public class Predicate1 {
	public static void main(String[] args) {
		// essa interface funcional predicate devolve true ou false
		Predicate<Produto> isCaro = prod -> (prod.getPreco() * 
				(1 - prod.getDesconto()) >= 750);

		Produto produto01 = new Produto("Notebook", 3800, 0.85);
		System.out.println(isCaro.test(produto01));
		
		Produto produto02 = new Produto("Notebook", 3800, 0.85);
		System.out.println(isCaro.test(produto02));
				

	}
}

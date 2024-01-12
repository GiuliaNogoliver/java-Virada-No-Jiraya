package lambdas.challenge;

import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.Produto;

public class Challenge {
	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 3985.78, 0.13);

		/*
		 * 1. A partir do produto calcular o preco real (com desconto) 
		 * 2. imposto Municipal: >= 2500(8,5%)/<300 (isento) 
		 * 3. Frete: >= 3000(100)/3000(50) 
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */
		
		/*
		 * Primeira Tentativa Consumer<Produto> totalValor = p -> { Double valorFinal =
		 * p.getPreco() - (1 * p.getDesconto()); return valorFinal; };
		 */

		Function<Produto, Double> totalValor = paramProd -> paramProd.getPreco() - (1 * paramProd.getDesconto());
		System.out.println(totalValor.apply(p));

		Predicate<Double> hasImposto = valorParam -> valorParam >= 2500;
		System.out.println(hasImposto.test(p.getPreco()));

		Function<Double, Double> valorImposto = precoProd -> precoProd >= 2500 ? (precoProd * 8.5)/100
				: precoProd;
		System.out.println(valorImposto.apply(p.getPreco()));
		
	}
}

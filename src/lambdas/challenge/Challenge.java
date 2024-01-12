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
		double v1 = totalValor.apply(p);
		System.out.println(v1);

		Predicate<Double> hasImposto = valorParam -> valorParam >= 2500;
		String v3 = hasImposto.test(p.getPreco()) == true ? "o frete é R$100" : "o frete é R$50";
		System.out.println(hasImposto.test(p.getPreco()));

		Function<Double, Double> valorImposto = precoProd -> precoProd >= 2500 ? (precoProd * 8.5)/100 + precoProd
				: precoProd;
		Double v2 = totalValor.andThen(valorImposto).apply(p);
		System.out.println(totalValor.andThen(valorImposto).apply(p));
		
		Function<Double, String> frete = valorTotal -> valorTotal >= 3000 ? "O frete é igual á R$100" : "O frete é igual á R$50";
		System.out.println(totalValor.andThen(valorImposto).andThen(frete).apply(p));
		
		System.out.printf("O valor total do seu produto com desconto é R$%.2f, o imposto ficou em R$%.2f e %s",
                v1, v2, v3);

	}
}

package lambdas.challenge;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class ChallengeOtherVersion {

	public static void main(String[] args) {
		/*
		 * 1. A partir do produto calcular o preco real (com desconto) 
		 * 2. imposto Municipal: >= 2500(8,5%)/<2500 (isento) 
		 * 3. Frete: >= 3000(100)/3000(50)
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */

		Function<Produto, Double> precoFinal = prodParam -> 
			prodParam.getPreco()- (prodParam.getPreco() * prodParam.getDesconto());
		UnaryOperator<Double> impostoMunicipal = preco -> 
			preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> 
			preco >= 3000 ? preco + 100.0 : preco + 50.0;
		UnaryOperator<Double> arredondar = preco -> 
			Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> 
			("R$" + preco).replace(".",",");

		Produto p = new Produto("Ipad", 3985.78, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é igual á" + preco);

	}
}

package lambdas.challenge;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class ChallengeOtherVersion {

	public static void main(String[] args) {
		Produto p = new Produto("Ipad", 3985.78, 0.13);
		
		Function<Produto, Double> precoFinal;
		UnaryOperator<Double> impostoMunicipal;
		UnaryOperator<Double> frete;
		UnaryOperator<Double> arredondar;
		Function<Double, String> formatar;
		
		
	}
}

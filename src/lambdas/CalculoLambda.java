package lambdas;

public class CalculoLambda {
	public static void main(String[] args) {
		// a lambda é a arrow function do javascript
		// ao envés de => usa ->
		Calculo soma = (x, y) -> { return x + y; };
		System.out.println(soma.calcular(2, 3));
		
		Calculo multiplicacao = (x, y) -> {return x * y;};
		System.out.println(multiplicacao.calcular(2, 3));
		
		// Aqui estou chamando os metodos staticos e default
		System.out.println(Calculo.massa());
		// Note que ainda podemos usar o metodo default na funcao lambda
		System.out.println(soma.legal());
	}
}

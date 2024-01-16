package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		// aplicando funcoes para um unico dado
		List<String> marcas = Arrays.asList("bmw", "ford", "chevrolet");
		marcas.stream()
			.map(m -> m.toUpperCase())
			.map(m -> m + " ")
			.forEach(print);



		// Se nao colocar "" o n nao vai ficar em string
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> gritando = n -> n.concat("!!!");

		// Nesse caso como as funcoes estao criadas independentes pode ser usada em mais dados
		System.out.println("\n\nUsando composiçao de funcoes...");
		marcas.stream()
				.map(maiuscula)
				.map(primeiraLetra)
				.map(gritando)
				.forEach(print);;
	}
}
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Fornecedor, ele fornece algo
public class Supplierr {
	public static void main(String[] args) {
		// nao passa parametro
		Supplier<List<String>> umaLista = () -> Arrays.asList("Well", "Giulia");
		
		// o fornecedor ao contrario do predicado, ele nao fornece .and
		System.out.println(umaLista.get());
	}
}

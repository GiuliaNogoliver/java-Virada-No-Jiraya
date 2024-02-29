package generics;

import java.util.List;

public class ListaUtil {
	
	// public static Object getUltimo1(List<? extends Object> lista) {
	// mesma coisa linha 7 e 9
	public static Object getUltimo1(List<?> lista) {
		// pegando o ultimo dado da lista
		return lista.get(lista.size() -1);
	}
	
	// passa um tipo T de parametro e retorna um tipo T
	public static <T> T getUltimo2(List<T> lista) {
		// pegando o ultimo dado da lista
		return lista.get(lista.size() -1);
	}
	
	// exemplo com mais tipos sendo passados
	public static <A, B ,C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
	
}

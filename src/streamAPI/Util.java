package streamAPI;

import java.util.function.UnaryOperator;

public interface Util {
	
	// final nao combina com interface
	public static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public static UnaryOperator<String> gritando = n -> n.concat("!!!");

}

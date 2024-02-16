package streamAPI.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class MapChallenge {
	public static void main(String[] args) {
		
	List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	/*
	 * Converter numero para string binaria... 6 => "110"
	 * Inverter String..."110" => "011"
	 * Converter binario para numero... "011" => 3
	 */
	
	//String binario = Integer.toBinaryString(6);
	UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
	Function<String, Integer> binarioParaInt = n -> Integer.parseInt(n, 2);
	
	numeros.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);;
	
	}
}

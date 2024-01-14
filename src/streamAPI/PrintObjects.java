package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class PrintObjects {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Gi", "Well", "Pit", "Andi");
		
		System.out.println("laço normal...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("com o iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("com o stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
}

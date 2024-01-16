package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Streams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		Stream<String> linguagens = Stream.of("Java, ", "JavaScript, ", "Lua \n");
		linguagens.forEach(print);

		String[] maisLinguagens = {"TypeScript, ", "Go, ", "Lisp \n"};
		Stream.of(maisLinguagens).forEach(print);
		Arrays.stream(maisLinguagens).forEach(print);
		Arrays.stream(maisLinguagens, 1, 3).forEach(print);
		
		List<String> outrasLinguages = Arrays.asList("PHP ", "C ", "Kotlin ");
		outrasLinguages.stream().forEach(print);
		outrasLinguages.parallelStream().forEach(print);
		
		//Loops infinitooos
		Stream.generate(() -> "Loop").forEach(println);
		Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}

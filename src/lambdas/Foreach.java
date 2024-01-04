package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Giulia", "Wellington", "Victor");
        System.out.println("Forma Tradicional: ");
        for(String nome: aprovados) {
        	System.out.println(nome);
        }
        
        System.out.println("\nUsando Lambda: ");
        //aprovados.forEach((nome) -> {System.out.println(nome);});
        aprovados.forEach(nome -> System.out.println(nome));
        
        // Quando menos codigo masi dificil de entender mas mais rapido de fazer
        System.out.println("\nMethod Reference: ");
        aprovados.forEach(System.out::println);
    }
}

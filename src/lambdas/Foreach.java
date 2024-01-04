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
        
        System.out.println("\nUsando Lambda #1: ");
        //aprovados.forEach((nome) -> {System.out.println(nome);});
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
        
        // Quando menos codigo mais dificil de entender mas mais rapido de fazer
        System.out.println("\nMethod Reference #1: ");
        aprovados.forEach(System.out::println);
        
        System.out.println("\nUsando Lambda #2: ");
        aprovados.forEach(nome -> imprimir(nome));
        
        System.out.println("\nMethod Reference #2: ");
        aprovados.forEach(Foreach::imprimir);
    }
    
    static void imprimir(String nome) {
    	System.out.println("nome: " + nome);
    }
}

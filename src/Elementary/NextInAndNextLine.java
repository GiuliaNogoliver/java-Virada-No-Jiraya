package Elementary;

import java.util.Scanner;

public class NextInAndNextLine {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	 
    System.out.println("Qual a sua idade?");
    int idade = entrada.nextInt();
    entrada.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
    System.out.println("Qual o seu nome?");
    String nome = entrada.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = entrada.nextLine();
 
    entrada.close();
}
}

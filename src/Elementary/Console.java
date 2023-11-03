package Elementary;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Good");
		System.out.print("Morning\n\n");
		
		System.out.println("早上");
		System.out.println("好");
		
		System.out.printf("Mensagem: %d %d ", 1, 2);
		System.out.printf("Salario: %.1f%n", 123.456);
		
		//o scanner è um tipo de variavel note a estrutura
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String name = entrada.nextLine();

		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("\nSeu nome inteiro é %s %s", name, sobrenome);
		
		//precisa fechar o scanner pois abriu ele e ele fica ocupando memoria
		entrada.close();
	}
}

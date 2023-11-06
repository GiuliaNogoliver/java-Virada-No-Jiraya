package br.com.elementary;

public class Inference {
	public static void main(String[] args) {
		/*o uso do var significa q vc n esta declarando o
		 * tipo de variavel mas logo qnd vc fala qual dado
		 * vai receber ele automaticamente atribui o tipo
		   ou seja ira inferir o tipo de dado*/
		var a = 1.0;
		System.out.println(a);
		
		//note nao posso agr dar uma variavel texto ao a
		//a = "Texto";
		
		a = 23.9;
		System.out.println(a);
		
		var b = "Texto";
		System.out.println(b);

		var nome = "Giulia";
		var sobrenome = "Oliveira";
		var idade = 21;
		var salario = 45000.500;
		
		//usamos \n para pular linha
		System.out.println("Nome: " + nome + 
							" \nSobrenome: " + sobrenome + 
							" \nIdade: " + idade + 
							" \nSalário: " + salario);
		
		/*usamos %s para strings e %d para double
		*o %.2f é para indicar q é um flutter e quero 2 casas decimais 
		*note o print F */
		System.out.printf("A %s %s tem %d anos e recebe um total de R$%.2f", 
							nome, sobrenome, idade, salario);
		
		String frase = String.format("\nA %s %s tem %d anos e recebe um total de R$%.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	
	}
}

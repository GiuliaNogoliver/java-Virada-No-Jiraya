package br.com.elementary;

import java.util.Arrays;

public class StringType {
	public static void main(String[] args) {
		System.out.println("Olá pessoa".charAt(2));
		
		/*O valor da String uma vez declarado é imutavel
		mas vc consegue substituir completamente*/
		String s = "Boa tarde";
		System.out.println(s);
		s = "Boa noite";
		System.out.println(s);
		
		//o charAt retorna informacao na posicao q vc pedir
		System.out.println(s.charAt(5));
		
		//o indexof e lastIndexOf retorna a posicao da informacao
		System.out.println(s.indexOf("Boa"));
		System.out.println(s.lastIndexOf("noite"));
		
		/*o startswith e endswith retorna um valor boleano sobre 
		*a afirmacao do q comeca*/
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("noite"));
		
		/*o split eu importei o array do java util
		*por que eu transformo em array e apartir de um caracter q
		*separa essa string*/
		String frase = "Giulia voce esta evoluindo!";
		String[] repartido = frase.split(" ");
		/*aqui como eu disse q a string è um array e dei um valor de string
		*o split dividi o array logo abaixo eu digo q è
		*um array e retorno uma respresentacao de string*/
		System.out.println(Arrays.toString(repartido));

		//replace
		String a = "Jullia";
		String meuNome = a
				.replace("J", "Gi")
				.replace("ll", "l");
		
		System.out.println("Meu nome na vdd é " + meuNome);
		
		//length
		System.out.println(meuNome.length());
		
		/*substring retorna a string
		 * tem q indica posicao inicial e a posicao final
		 */
		System.out.println(meuNome.substring(0, 3));
		
		//contains, retorna booleano se tem a string
		String palavra = "meu";
		frase = "meu nome é Giulia ";
		System.out.println(frase.contains(palavra));
		
		//isEmpaty
		System.out.println(frase.isEmpty());
		
		//toLowCase e toUpCase
		System.out.println(frase.toLowerCase());
		System.out.println(frase.toUpperCase());
		
		//Remove todos os espaços no início e no fim da sua string
		System.out.println(frase.trim());
	}
}

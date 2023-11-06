package br.com.elementary;

public class PointNotation {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Giulia");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		System.out.println(s);

		String a = "Olá X";
		System.out.println(a.replace("X", "Giulia,").toUpperCase().concat(" Tudo bem?"));

		// Os tipos primitivos nao possuem a notacao "."

		// assim nao funciona por exemplo
		/*
		 * double n = 1.0; System.out.println(n.);
		 */
	}
}

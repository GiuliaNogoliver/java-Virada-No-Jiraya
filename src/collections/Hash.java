package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<User> user = new HashSet<User>();

		// Precisa criar um objeto toda vez q usar o metodo pois estamos usando a
		// instacia User e nao criando variaveis dentro da classe
		user.add(new User("Giulia"));
		user.add(new User("Wellington"));
		user.add(new User("Giovanna"));

		// quando tiramos o metodo HashCode da classe User e tenta executar o metodo
		// abaixo ele retornará false pois precisa contar os caracteres dos objetos
		// para entqao usar o equals e comparar, ou seja sempre implementar o hasCode
		// e o equals
		boolean result = user.contains(new User("Giulia"));
		System.out.println(result);
	}
}

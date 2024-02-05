package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		// O map é essa estrutura chave-valor onde podemos ter 
		// a melhor manipulacao dos dados
		HashMap<Integer, String> user = new HashMap<>();

		user.put(1, "Giulia");
		user.put(2, "Wellington");
		user.put(3, "Giovanna");
		user.put(4, "Rainundo");
		user.put(4, "Raimundo");

		System.out.println(user.size());
		System.out.println(user.isEmpty());

		System.out.println(user.keySet());
		System.out.println(user.values());
		System.out.println(user.entrySet());

		System.out.println(user.containsKey(20));
		System.out.println(user.containsKey(4));
		System.out.println(user.containsValue("Giovanna"));

		System.out.println(user.get(2));
		System.out.println(user.remove(3));
		// voce pode passar a chave e o valor mas se esses nao corresponderem nada sera feito
		System.out.println(user.remove(3, "Giulia"));

		// Percorrendo valores separadamente
		for (String name : user.values()) {
			System.out.println(name);
		}

		// Percorrer os valores
		for (Entry<Integer, String> register : user.entrySet()) {
			System.out.print(register.getKey() + " -> ");
			System.out.println(register.getValue());
		}

	}
}

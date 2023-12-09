package br.com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		// LIFO - Last In First Out

		// add e push fazem a mesma coisa
		// a diferença está quando a pilha está cheia
		stack.add("O Pequeno principe"); // lança excessão
		stack.push("O Hobbit"); // retona false
		stack.add("Alcorão");
		stack.push("Biblia");

		for (String book : stack) {
			System.out.println(book);
		}

		// peek e element retona o proximo elemento da fila
		// a diferença é qnd a pilha está vazia

		System.out.println(stack.peek()); // lança excessão
		System.out.println(stack.element()); // retorna false

		// poll e remove fazem a mesma coisa removem o proximo
		// a diferença é qnd estão vazias

		stack.pop(); // lançar excessão
		stack.poll(); // retona false
		stack.pop();
		// stack.poll();
		// stack.pop();
		// stack.poll();

		for (String book : stack) {
			System.out.println(book);
		}

		// outras funções importantes
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.contains("Giovanna"));
		stack.clear();
	}
}

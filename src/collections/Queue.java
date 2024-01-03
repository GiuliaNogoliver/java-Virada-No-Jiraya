package collections;

import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
		LinkedList<String> fila = new LinkedList<>();
		//FIFO - First In First Out
		
		//add e offer adicionam elementos na fila
		// a diferença é quando a fila está cheia
		
		fila.add("Giulia"); //lança uma excessão
		fila.offer("Wellington"); // retorna false
		fila.add("Giovanna");
		fila.offer("Raimundo");
		System.out.println(fila);
		
		//peek e element retona o proximo elemento da fila
		//a diferença é qnd a fila está vazia
		
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.element()); //lança uma excessão
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println(fila);
		
		//poll e remove fazem a mesma coisa removem o proximo
		//a diferença é qnd estão vazias
		
		System.out.println(fila.poll()); //retona false
		System.out.println(fila.remove()); //lança uma excessão
		System.out.println(fila);
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
		//outras funções importantes
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila.contains("Giovanna"));
		fila.clear();
		
	}
}

package generics.project;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

// Essa classe faz uma forma bem generica de armazenas chave-valor

// Especificando que o tipo C sera Numero
public class Pares<C extends Number, V> {
	// É um conjunto ordenado (SortedSet) de elementos 
	// do tipo Par<C, V>
	//private final SortedSet<Par<C, V>> itens = new TreeSet<>();
	private final Set<Par<C, V>> itens = new HashSet<>();

	public void adicionar(C chave, V valor) {
		// validar se a chave esta vazia, sai do metodo
		if (chave == null) return;
		Par<C, V> novoPar = new Par<C, V>(chave, valor);

		// validando se contem ja a chave
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}

		// if(chave != null) {
		itens.add(new Par<C, V>(chave, valor));
	}

	public V getValor(C chave) {
		// validacao se esta vazio
		if (chave == null) return null;
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		return parOpcional.isPresent() 
				? parOpcional.get().getValor() 
						: null;
	}
}

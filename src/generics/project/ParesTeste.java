package generics.project;

public class ParesTeste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Gui");
		resultadoConcurso.adicionar(4, "Ana");
		resultadoConcurso.adicionar(2, "Rebeca");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		// ele substitui pelo ultimo adicionado nessa chave
		// pq no nosso hashCode e equals usamos apenas a chave 
		// como referencia de constancia.
		System.out.println(resultadoConcurso.getValor(2));
		
		// Se nao tivessemos implementado o metodo para se conter 
		// uma chave sobrescrever o valor, 
		// ele manteria o pedro pois por padrao o comportamento do set 
		// é manter o primeiro associado e ignorar o valor adicionado 
		// por ultimo.
	}
}

package br.com.oop.encapsulation.casaB;

import br.com.oop.encapsulation.casaA.Ana;

public class Pedro extends Ana {
	
	Ana mae = new Ana();
	void testeAcessos() {
		// segredo
		// facoEmCasa
		// formaDeFalar
		// todosSabem
		
		//System.out.println(segredo);
		//System.out.println(mae.facoEmCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
	// acessar atributo protected por herança nao tem como
}

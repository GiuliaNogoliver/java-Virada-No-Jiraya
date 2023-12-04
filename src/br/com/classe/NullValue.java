package br.com.classe;

public class NullValue {
	public static void main(String[] args) {

		// vazio vc null
		String s = "";
		System.out.println(s.concat("test"));

		// O objeto nao pode apontar para um endereço nulo
		// ou ela é primitiva e tem um valor ou aponta para um endereço de memoria onde
		// esse objeto foi criado
		//nao é um objeto real um objeto nulo
		Date d1 = Math.random() > 0.5 ? new Date() : null ;
		if (d1 != null) {
			d1.month = 3;
			System.out.println(d1.formatedBrazilDate());
		}
		
		//? se sim : se nao nesse contexto de > ou <
		//random escolhe um numero aleatorio de 0 a 1
		String s2 = Math.random() > 0.5 ? "aaa" : null;
		if(s2 != null) {
			System.out.println(s2.concat("!!"));
		}
	}
}

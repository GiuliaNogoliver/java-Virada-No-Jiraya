package classAndMethods;

public class ValueVsReference {
	public static void main(String[] args) {

		// atribuicao por valor (tipos primitivos)
		int a = 1;
		int b = a;

		a++;
		b--;

		System.out.println(a);
		System.out.println(b);

		// atribuicao por referencia (objetos ou instancias)
		Date c = new Date();

		System.out.println(c.formatedBrazilDate());

		var d = c;
		c.day = 2;

		System.out.println(c.formatedBrazilDate());
		System.out.println(d.formatedBrazilDate());
		
		formatedInicialDate(c);
		
		System.out.println(c.formatedBrazilDate());
	}
	
	// um metodo static sò consegue acessar outro metodo static da mesma classe
	static void formatedInicialDate(Date c) {
		c.day = 7;
		c.month = 5;
		c.year = 2002;
	}
	
}
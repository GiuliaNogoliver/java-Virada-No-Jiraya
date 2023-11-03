package Elementary;

public class Inference {
	public static void main(String[] args) {
		/*o uso do var significa q vc n esta declarando o
		 * tipo de variavel mas logo qnd vc fala qual dado
		 * vai receber ele automaticamente atribui o tipo
		   ou seja ira inferir o tipo de dado*/
		var a = 1.0;
		System.out.println(a);
		
		//note nao posso agr dar uma variavel texto ao a
		//a = "Texto";
		
		a = 23.9;
		System.out.println(a);
		
		var b = "Texto";
		System.out.println(b);
	}
}

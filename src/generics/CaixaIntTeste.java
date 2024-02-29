package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		// Posso declarar o tipo tanto aqui com <String>
		// qnt na propria classe CaixaInt e deixar assim:
		// CaixaInt caixaA =  new CaixaInt();
		CaixaInt<String> caixaA =  new CaixaInt<>();
		caixaA.guardar("Wellington");
		// Note que com o generics nao preciaso de casting
		String nome = caixaA.tirar();
		System.out.println(nome);
	}
}
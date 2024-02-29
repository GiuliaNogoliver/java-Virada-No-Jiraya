package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		// no generics vc nao precisa usar casting para retornar valores
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo");
		String coisaA = caixaA.tirar();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.9282);
		Double coisaB = caixaB.tirar();
		System.out.println(coisaB);
	}
}

package generics;

public class CaixaNumberTeste {
	public static void main(String[] args) {
		CaixaNumber<Integer> caixaA = new CaixaNumber<>();
		caixaA.guardar(25);
		Integer coisaA = caixaA.tirar();
		System.out.println(coisaA);
		
		CaixaNumber<Double> caixaB = new CaixaNumber<>();
		caixaB.guardar(5.90);
		Double coisaB = caixaB.tirar();
		System.out.println(coisaB);
	}
}

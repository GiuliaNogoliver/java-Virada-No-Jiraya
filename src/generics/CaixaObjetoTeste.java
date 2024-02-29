package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.30);
		// note q 2.3 é double mas como a classe armazera Object 
		// está guradando como Wrapper double -> Double implicitamente
		
		Double coisaA = (Double) caixaA.tirar();
		// Precisa fazer o casting		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Giulia");
		
		String coisaB = (String) caixaB.tirar();
		System.out.println(coisaB);
	}
}

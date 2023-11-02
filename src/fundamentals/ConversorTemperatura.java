package fundamentals;

public class ConversorTemperatura {
	public static void main(String[] args) {
		// (F - 32)* 5/9 = C
		int fairenzin = 105;
		final int X = 32;
		/*
		 * Note quando colocado o 9 sem o .0 o java nao entende que 
		 * é decimal e sempre dá 0 essa divisao
		 */
		final double Y = 5 / 9.0;
		double celsius = (fairenzin - X) * (Y);
		System.out.println("O valor é igual a " + celsius + "C");

		fairenzin = 95;
		celsius = (fairenzin - X) * (Y);
		System.out.println("O valor é igual a " + celsius + "C");

	}
}

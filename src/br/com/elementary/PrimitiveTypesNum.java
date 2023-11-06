package br.com.elementary;

public class PrimitiveTypesNum {
	public static void main(String[] args) {
		
		//o java na conversao so analisa tipo, nao analisa o valor
		
		//conversao implicita
		double a = 1;
		System.out.println(a);
		
		//conversao explicita (CAST)
		float b = (float) 1.1234567899999;
		System.out.println(b);
		
		/*repare q qnd a gente muda o valor de c para 128 ele joga para
		a outra ponta q suporta o byte, -128*/
		int c = 128;
		byte d = (byte) c; //explicito (CAST)
		System.out.println(d);
		
		//note q ele nao arredonda
		double e = 1.999999999;
		int f = (int) e; //explicito (CAST)
		System.out.println(f);
		
	}
}

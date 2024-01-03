package elementary;

public class Logic {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 7 < 1;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2 );
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		//Tabela Verdade E (AND)
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		//Tabela Verdade OU (OR)
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false|| true);
		System.out.println(false || false);
		
		//Tabela Verdade OU Exclusivo (XOR)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(true ^ true);
		
		//Tabela Verdade NOT
		System.out.println(!true);
		System.out.println(!false);
	}
}

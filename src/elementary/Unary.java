package elementary;

public class Unary {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1;
		a--; 
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
//		//note que o b só foi descrementado depois de ser comparado
		System.out.println(++a == b--); //precedencia
		System.out.println(a == b);
		/*a operacao de incrementar e descrementar n precisa ser guardada
		em uma variavel*/
		System.out.println(a);
		System.out.println(b);
	}
}

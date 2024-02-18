package exception;

public class Basic {
	// Erros de execuçao
	public static void main(String[] args) {
		Aluno a1 = null;

		// O erro que gera é o Arithmetic Exception que herda de Exception
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro na divisao" + e.getMessage());;
		}

		// Nessa caso um NullPointerException dará pois na linha 5 o obj é declarado
		// nulo
		try {
			imprimirNome(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao imprimir nome do Aluno" + e.getMessage());
		}
		
		System.out.println("Fim :)");
	}

	public static String imprimirNome(Aluno aluno) {
		return "O nome do aluno é " + aluno.name;
	}
}

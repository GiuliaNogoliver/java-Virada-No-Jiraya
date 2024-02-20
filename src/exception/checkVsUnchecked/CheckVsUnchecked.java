package exception.checkVsUnchecked;

public class CheckVsUnchecked {
	public static void main(String[] args) {
		try {
			getError01();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			getError02();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getSuppressed());
		}

		System.out.println("Fim :)");
	}

	// Exceçao  NAO checada ou NAO verificada 
	// pois a gente pode escolher ou nao tratar o erro
	static void getError01() {
		// Precisa colocar o throw pois precisa ser lançada
		throw new RuntimeException("ocorreu um erro bem legal! #01");
		// A classe runtimeExection ta dentro de exception que esta dentro de throwable
	}

	// Exceçao checada ou verificada 
	static void getError02() throws Exception {
		// declaração de assinatura do método throws Exception e ajuda a documentar o
		// comportamento do método para quem for usá-lo
		throw new Exception("ocorreu um erro bem legal! #02");
		// quando se laná essas execoes precisa tratar dentro de um try catch
	}
}

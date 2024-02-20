package exception;

public class Trainning {
	static int hexChar2int(char c) throws Exception {
		if (c >= '0' & c <= '9')
			return c - '0';
		if (c >= 'A' & c <= 'F')
			return c - 'A' + 10;
		if (c >= 'a' & c <= 'f')
			return c - 'a' + 10;
		throw new Exception("caractere nao e hexadecimal!");
	}

	public static void main(String[] args) {
		try {
			int i = hexChar2int('G');
			System.out.println("Tudo ok! i iniciou com:" + i);
		} catch (Exception p) {
			System.out.println("problema:" + p);
		}
	}
}
/*
 * public static void main(String[] arg) { System.out.println(desafio()); }
 * 
 * static int desafio() { try { return 1; } finally { return 2; } } }
 */
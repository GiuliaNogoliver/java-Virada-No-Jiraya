package exception.finallyUse;

import java.util.Scanner;

// O finnaly é executado sempre
public class Finally {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println(7 / entrada.nextInt());
			// ele nao fecha pois a excessao cai logo no /0
		} catch (Exception e) {
			System.out.println("Finally #1");
			System.out.println(e.getMessage());
		} finally {
			entrada.close();
		}

		// Pode usar try/finally e try/catch/finally
		try {
			System.out.println(7 / entrada.nextInt());
		} finally {
			System.out.println("Finally #2");
			entrada.close();
		}
		
		System.out.println("Exceptions tratadas, chegou ao fim do programa!");
	}
}

package controlStructures;

public class BreakLabel {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 10; i++) {
			if (i > 5) {
				break externo;
			}
			interno: for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
				if (j == 5) {
					break interno;
				}
			}
			System.out.println();
		}
	}
}

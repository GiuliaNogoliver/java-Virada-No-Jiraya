package controlStructures;

public class ContinueLabel {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			interno: for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
				if (i < 7) {
					continue interno;
				}
			}
			System.out.println();
		}
	}
}

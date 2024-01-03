package controlStructures;

public class For03 {
	public static void main(String[] args) {
		int i = 0;
		for(;i <= 10; i++) {
			for(int x = 0; x <= 10; x++) {
				System.out.printf("[%d:%d]", i, x);
			}
				System.out.println();
		}
		System.out.println(i);
	}
}
package controlStructures;

public class Continue {
	public static void main(String[] args) {
		for(int i = 10;i > 0; i--) {
			System.out.println(i);
			if(i >= 5) {
				System.out.println(i);
				continue;
			}
		}
	}
}

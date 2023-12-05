package br.com.arrays;

public class Foreach {
	public static void main(String[] args) {
		int[] scoreA = new int[5];
		scoreA[0] = 1;
		scoreA[1] = 2;
		scoreA[2] = 3;
		scoreA[3] = 4;
		scoreA[4] = 5;

//		System.out.println(scoreA[2]);
		
		//dois tipos de laços
		//
		for (int score : scoreA) {
			System.out.println(score + " ");
		}
		//entregam a mesma repeticao
		for (int i = 0; i < 5; i++) {
			System.out.println(scoreA[i]);
		}

		String[] scoreB = { "A", "B", "C", "D", "E" };
		
		for(String score : scoreB) {
			System.out.println(score);
		}
	}
}

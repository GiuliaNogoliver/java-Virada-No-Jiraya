package br.com.oop.inheritance.usingEnum;

public class Game {
	public static void main(String[] args) {
		Player player1 = new Hero("Giulia");
		player1.x = 10;
		player1.y = 11;

		Player player2 = new Monster("Wellinton");
		player2.x = 10;
		player2.y = 12;
		
		System.out.println(player1.life);
		System.out.println(player1.x);
		System.out.println(player1.y);
		
		player1.attack(player2);
		player1.attack(player2);

		System.out.println(player2.life);
		System.out.println(player2.x);
		System.out.println(player2.y);
		
		System.out.println(player1.showMatrices());
		System.out.println(player2.showMatrices());
	}
}
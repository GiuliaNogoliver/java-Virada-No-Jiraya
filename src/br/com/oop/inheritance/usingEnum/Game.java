package br.com.oop.inheritance.usingEnum;

public class Game {
	public static void main(String[] args) {
		Player player1 = new Player("Giulia");

		player1.walkingPositions(Direction.NORTH);
		player1.walkingPositions(Direction.NORTH);
		player1.walkingPositions(Direction.SOUTH);
		player1.walkingPositions(Direction.SOUTH);

		System.out.println(player1.x);
		System.out.println(player1.y);
		System.out.println(player1.showMatrices());
	}
}
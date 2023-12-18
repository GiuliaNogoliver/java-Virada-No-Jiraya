package br.com.oop.inheritance.usingEnum;

import java.util.Arrays;

public class Player {
	String name;
	int x;
	int y;
	int[] currentPosition;
	int life = 100;

	Player() {

	}

	Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Player(String name) {
		this.name = name;
		this.currentPosition = new int[2];
		this.currentPosition[0] = this.x;
		this.currentPosition[1] = this.y;
	}

	boolean attack(Player opponent) {
		int deltaX = Math.abs(x - opponent.x);
		int deltaY = Math.abs(y - opponent.y);

		if (deltaX == 0 && deltaY == 1) {
			opponent.life -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			opponent.life -= 10;
			return true;
		} else {
			System.out.println("Impossibilitado de atacar");
			return false;
		}
	}

	void walkingPositions(Direction direction) {
		if (direction == Direction.EAST) {
			x++;
		} else if (direction == Direction.WEST) {
			x--;
		} else if (direction == Direction.SOUTH) {
			y--;
		} else if (direction == Direction.NORTH) {
			y++;
		} else {
			System.out.println("Direçao inválida");
		}
		currentPosition[0] = x;
		currentPosition[1] = y;
	}

	String showMatrices() {
		return Arrays.toString(currentPosition);
	}
}

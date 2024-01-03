package oop.inheritance.usingEnum;

import java.util.Arrays;

public class Player {
	String name;
	public int x;
	public int y;
	public int[] currentPosition;
	public int life = 100;
	
	private int deltaX;
	private int deltaY;
	

	protected Player() {

	}

	protected Player(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected Player(String name) {
		this.name = name;
		this.currentPosition = new int[2];
		this.currentPosition[0] = this.x;
		this.currentPosition[1] = this.y;
	}

	public boolean attack(Player opponent) {
		deltaX = Math.abs(x - opponent.x);
		deltaY = Math.abs(y - opponent.y);

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

	public void walkingPositions(Direction direction) {
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

	public String showMatrices() {
		return Arrays.toString(currentPosition);
	}
}

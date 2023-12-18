package br.com.oop.inheritance.usingEnum;

import java.util.Arrays;

public class Player {
	String name;
	int x;
	int y;
    int[] currentPosition;

    	Player(String name) {
        this.name = name;
        this.currentPosition = new int[2];
        this.currentPosition[0] = this.x;
        this.currentPosition[1] = this.y;
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

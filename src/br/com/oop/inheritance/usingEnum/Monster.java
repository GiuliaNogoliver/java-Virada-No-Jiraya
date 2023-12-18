package br.com.oop.inheritance.usingEnum;

public class Monster extends Player {

	Monster(){
		super(0, 0);
	}
	Monster(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Monster(String name) {
		super(name);
	}

}

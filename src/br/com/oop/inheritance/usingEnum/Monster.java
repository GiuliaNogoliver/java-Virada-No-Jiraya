package br.com.oop.inheritance.usingEnum;

public class Monster extends Player {

	Monster(){
		this(0, 0);		//Esse this chama o construtor abaixar
	}
	Monster(int x, int y){
		super(x, y);	//O super chama o construtor da classe Player
	}
	
	public Monster(String name) {
		super(name);
	}
	
	// Super. e this. chama metódos e atributos
	// Super() e this() chama construtores

	// Se o construtor padrao nao estiver declarado explicitamente na 
	// classe super ent deve criar este e 
	// um construtir para a clase filha e referenciar o construtor pai 
}

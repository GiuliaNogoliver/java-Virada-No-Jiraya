package br.com.oop.inheritance.challenge;

public class Ferrari extends Car{
	
	//	Anotacao de q esta sobreescrevendo
	@Override
	void speed() {
		velocity += 15;
	}
}

package br.com.oop.inheritance.challenge;

public class Ferrari extends Car{
	
	Ferrari(){
		super(340);
	}
	
	Ferrari(int MAX_VELOCITY){
		super(MAX_VELOCITY);
	}
	// delta = 15;
	
	//	Anotacao de q esta sobreescrevendo
	@Override
	void speed() {
		velocity += 15;
	}
}

package br.com.oop.inheritance.challenge;

public class Ferrari extends Car{
	
	public Ferrari(){
		super(340);
	}
	
	public Ferrari(int MAX_VELOCITY){
		super(MAX_VELOCITY);
	}
	// delta = 15;
	
	//	Anotacao de q esta sobreescrevendo
	@Override
	public void speed() {
		velocity += 15;
	}
}

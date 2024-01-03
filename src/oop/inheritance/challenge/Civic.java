package oop.inheritance.challenge;

import java.util.Date;

public class Civic extends Car{
	
	Date anoFabricacao;
	
	public Civic(){
		this(212);
	}
	
	Civic(int MAX_VELOCITY){
		super(MAX_VELOCITY);
	}
	
	Civic(Date anoFabricacao, int MAX_VELOCITY){
		this(MAX_VELOCITY);
		this.anoFabricacao = anoFabricacao;
	}
	/*this.anoFabricacao = anoFabricacao;
	 *this(MAX_VELOCITY); 
	 *assim nao pode, 
	 *pois primeiro deve se atribuir o valor do parametro do construtor*/
}

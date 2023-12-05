package br.com.classAndMethods.challange;

public class Person {
	String personName;
	double personWeight;

	Person(String namePerson, double personWeight) {
		this.personName = namePerson;
		this.personWeight = personWeight;
	}
	
	void eatFood(Food food){
		if(food != null) {
			this.personWeight += food.weightFood;			
		}
	}
	String show() {
		return "meu nome é " + personName  + " e peso " + personWeight + "kg depois de comer";
	}
}

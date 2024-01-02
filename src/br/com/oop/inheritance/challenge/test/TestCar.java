package br.com.oop.inheritance.challenge.test;

import br.com.oop.inheritance.challenge.Civic;
import br.com.oop.inheritance.challenge.Ferrari;

public class TestCar {
	public static void main(String[] args) {
		Civic civic = new Civic();

		System.out.println(civic);
		civic.speed();
		civic.speed();
		System.out.println(civic);

		civic.breaker();
		System.out.println(civic);

		Ferrari ferrari = new Ferrari();
		ferrari.speed();
		ferrari.speed();
		System.out.println(ferrari);

		ferrari.breaker();
		System.out.println(ferrari);

		Ferrari c2 = new Ferrari();
		c2.ligarTurbo();
		c2.speed();
		System.out.println(c2.getVelocity());

		c2.ligarAr();
		c2.ligarAr(); // teste
		c2.ligarAr(); // teste
		c2.speed();
		System.out.println(c2.getVelocity());
		c2.desligarAr();
		c2.desligarAr(); // teste
		c2.speed();
		System.out.println(c2.getVelocity());

		System.out.println(c2.airLevel());
	}
}

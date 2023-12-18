package br.com.oop.inheritance.challenge;

public class TestCar {
	public static void main(String[] args) {
		Car civic = new Civic();

		System.out.println(civic);
		civic.speed();
		civic.speed();
		System.out.println(civic);

		civic.breaker();
		System.out.println(civic);

		Car ferrari = new Ferrari();
		ferrari.speed();
		ferrari.speed();
		System.out.println(ferrari);

		ferrari.breaker();
		System.out.println(ferrari);
	}
}

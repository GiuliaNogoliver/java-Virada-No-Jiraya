package br.com.oop.abstracto;

public class AbstractTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		
		Mammal b = new Dog();
		System.out.println(b.mamar());
		System.out.println(b.respirar());
	}
}

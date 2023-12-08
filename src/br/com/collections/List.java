package br.com.collections;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<User> firstList = new ArrayList<>();

		User user01 = new User("Giulia");
		firstList.add(user01);

		firstList.add(new User("Paul"));
		firstList.add(new User("Carmem"));
		firstList.add(new User("Joelma"));

		System.out.println(firstList);
		System.out.println(firstList.get(3)); // acesso peli indice

		firstList.remove(3);
		System.out.println(firstList);

		firstList.contains(new User("Carmem"));

		for (User name : firstList) {
			System.out.println(name);
		}
	}
}

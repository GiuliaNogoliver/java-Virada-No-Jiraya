package br.com.collections;

import java.util.HashSet;

public class Set {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet firstSet = new HashSet();

		firstSet.add(1);
		firstSet.add("x");
		firstSet.add("String");
		firstSet.add(true);
		firstSet.add(1.1); // double primitivo -> Double wrapper

		// nas collections nao podem conter dados primitivos logo 
		// ele converte para um wrapper

		System.out.println(firstSet.size());

		firstSet.remove("x");
		System.out.println(firstSet.size());

		System.out.println(firstSet.contains(1));
		System.out.println(firstSet.contains(true));

		HashSet secondSet = new HashSet();

		secondSet.add(1);
		secondSet.add("y");
		secondSet.add("World");
		secondSet.add("world");
		secondSet.add("world"); //ele nao duplica dado
		secondSet.add(false);
		secondSet.add(1.1);

		secondSet.contains(firstSet);
		System.out.println(secondSet);

		secondSet.addAll(firstSet);
		System.out.println(secondSet);
		
		secondSet.retainAll(firstSet);
		System.out.println(secondSet);
	}
}

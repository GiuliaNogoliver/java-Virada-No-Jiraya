package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetUnorganized {
	public static void main(String[] args) {
		//<> isso é o generics, vc define o tipo de dado q recebera
		TreeSet<Object> list = new TreeSet<Object>();
		list.add("Giulia");
		list.add("Wellington");
		list.add("Ana");
		list.add("Victor");
		list.add("Matheus");
		
		System.out.println(list);
		for(Object name: list) {
		System.out.println(name);
		}
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		
		System.out.println(numbers);
		for(int nums: numbers) {
			System.out.println(nums);
		}
	}
}

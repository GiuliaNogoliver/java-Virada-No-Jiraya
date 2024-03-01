package generics.project;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		// O threeSet usa o comparable e por isso consegue ele 
		// consegue ordenanr por ordem e nao sobreescrever
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		nums.add(10);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(123);
		nums.add(-13);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}

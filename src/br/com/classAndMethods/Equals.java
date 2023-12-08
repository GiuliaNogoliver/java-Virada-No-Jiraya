package br.com.classAndMethods;

public class Equals {
	public static void main(String[] args) {
		User user01 = new User();
		user01.name = "Wellington";
		user01.email = "wellpereira@uorak.com";

		User user02 = new User();
		user01.name = "Wellington";
		user01.email = "wellpereira@uorak.com";
		
		User user03 = new User();
		user01.name = "Giulia";
		user01.email = "giuliaoliveira@uorak.com";
		
		System.out.println(user01.equals(user02));
		System.out.println(user02.equals(user03));
		
		System.out.println(user01 == user02);
		
	}
}

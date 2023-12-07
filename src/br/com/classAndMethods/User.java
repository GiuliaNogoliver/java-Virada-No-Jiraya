package br.com.classAndMethods;

public class User {
	String name;
	String email;

	public boolean equals(Object objeto) {
//		User other = (User) objeto;

		if(objeto instanceof User) {
			return true;
		}
		return false;
		
//		boolean equalName = other.name.equals(this.name);
//		boolean equalEmail = other.email.equals(this.email);
		
//      if(other.name == this.name && other.email == this.email) {
//			return true;
//		}
//		return equalName && equalEmail;
	}
}

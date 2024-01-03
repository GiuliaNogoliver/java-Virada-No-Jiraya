package classAndMethods;

public class User {
	String name;
	String email;

	public boolean equals(Object objeto) {
		User outro = (User) objeto;

		if (outro.name == this.name && outro.email == this.email) {
			return false;

		} else {
			return true;
		}
		/*
		 * boolean emailIgual = outro.email.equals(this.email); boolean nomeIgual =
		 * outro.name.equals(this.name);
		 * 
		 * return emailIgual && nomeIgual;
		 */

		// depois eu vejo o hashCode

//		if(objeto instanceof User) {
//			User other = (User) objeto;
//			return super.equals(other);
//		}

//		boolean equalName = other.name.equals(this.name);
//		boolean equalEmail = other.email.equals(this.email);

//      if(other.name == this.name && other.email == this.email) {
//			return true;
//		}
//		return equalName && equalEmail;
	}
}

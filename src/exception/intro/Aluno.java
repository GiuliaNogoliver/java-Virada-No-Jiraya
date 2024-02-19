package exception.intro;

import java.util.Objects;

public class Aluno {
	public final String name;
	private final double nota;
	
	public Aluno(String name, double nota) {
		this.name = name;
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	};
	
	public String toString() {
		return name + " tem a nota " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(name, other.name) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	

}

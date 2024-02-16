package streamAPI;

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
}

package oop.encapsulation.person;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome,String sobrenome, int idade) {
		this.setNome(nome);
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	// getIdade
	public int lerIdade() {
		return idade;
	}

	// setIdade
	public void alterarIdade(int novaIdade) {
		// transformando em absoluto se a novaIdade vier -36 ele tranforma em positivo
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
		
	public String getNomeCompleto() {
		return getNome() + " " + sobrenome;
	}
	
	// usando o source>generate
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Olá eu sou a " + getNome()
				+ " e tenho " + getIdade() + " anos";
	}
}

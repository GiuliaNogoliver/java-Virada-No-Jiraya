package oop.polymorphism;

public class Pessoa {
	private String nome;
	private double peso;
	
	public Pessoa(String name, double peso) {
		setNome(name);
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}	
}

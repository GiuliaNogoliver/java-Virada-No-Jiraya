package lambdas;

// Toda classe extends object so que implicito
public class Produto extends Object {
	private final String nome;
	private final double preco;
	private final double desconto;

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}
	
	@Override
	public String toString() {
		return nome + " no valor de R$" + preco + " com desconto fica R$" + preco *(1 - desconto);
	}
	

}

package generics;

// é usado letras para definir tipos, como T, A, C
// Se colocar palavra letra maiuscula
public class Caixa<BANANA> {
// No generics vc pode definir qualquer nome e criar o objeto desse tipo
	private BANANA coisa;
	
	public void guardar(BANANA coisa) {
		this.coisa = coisa;
	}
	
	public BANANA tirar() {
		return coisa;
	}
}

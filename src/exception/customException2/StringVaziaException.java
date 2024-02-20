package exception.customException2;

// Serializacao no java é um processo de transformar as instancias em um arquivo do tipo texto(txt)
@SuppressWarnings("serial")
// Quando extende de Exception nao é checkada
public class StringVaziaException extends Exception {
	private String nomeAtributo;

	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}

	// botando aspas simples o java entende q é um atributo
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeAtributo);
	}
}

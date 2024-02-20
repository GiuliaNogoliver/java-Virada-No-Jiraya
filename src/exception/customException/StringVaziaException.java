package exception.customException;

// Serializacao no java é um processo de transformar as instancias em um arquivo do tipo texto(txt)
@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	private String nomeAtributo;

	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}

	// botando aspas simples o java entende q é um atributo
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeAtributo);
	}
}

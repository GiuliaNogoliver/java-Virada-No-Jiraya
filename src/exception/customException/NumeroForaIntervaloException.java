package exception.customException;

// Serializacao no java é um processo de transformar as instancias em um arquivo do tipo texto(txt)
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	private String nomeAtributo;

	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	// botando aspas simples o java entende q é um atributo
	public String getMessage() {
		return String.format("O atributo '%s' está nagativo", nomeAtributo);
	}
}

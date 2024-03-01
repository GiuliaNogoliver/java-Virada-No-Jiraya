package pattern.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Namorado namorada = new Namorado();
		Porteiro porteiro = new Porteiro();
		
		// Preciso registrar a intencao do namorado saber do evento
		// por isso temos uma lista de interesados no evento na classe porteiro
		porteiro.adicionarObservador(namorada);
		porteiro.monitorar();
		
		//porteiro.adicionarObservador(o -> System.out.println("Surpresa via lambda"));
	}
}

package pattern.observer;

public class Namorado implements ObservadorChegadaAniversariante{

	public void chegou(EventoChegadaAniversariante event) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("SURPRESAAA!!!");
	}
}

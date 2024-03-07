package pattern.observer;

@FunctionalInterface
// Todo observador precisa implementar uma interface
public interface ObservadorChegadaAniversariante {
	public void chegou(EventoChegadaAniversariante event);
}

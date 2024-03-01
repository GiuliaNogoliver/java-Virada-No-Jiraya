package pattern.observer;

@FunctionalInterface
// Todo observador precisa implementar uam interface
public interface ObservadorChegadaAniversariante {
	public void chegou(EventoChegadaAniversariante event);
}

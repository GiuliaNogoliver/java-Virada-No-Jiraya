package streamAPI.reduce;

public class MediaTeste {
	public static void main(String[] args) {
		// Encadeando a funcao media
		Media m1 = new Media().adicionar(8.2).adicionar(7.9);
		Media m2 = new Media().adicionar(8.2).adicionar(7.9);
		
		System.out.println(m1.getValor());
		System.out.println(m1.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
	}
}

package elementary;

public class Ternary {
	public static void main(String[] args) {
		
		double media = 9.9;
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperaçao";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Nao";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}

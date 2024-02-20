package exception.customException2;

import exception.basic.Aluno;

public class ValidacaoTeste {
	public static void main(String[] args) {
		// Por se tratar de exception checkada essa personalizacao de excessao temos que
		// usar os metodos da classe validar q extends exception dentro de um try-cacth
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
			// Apartir do Java 7 ou 8 pide colocar a pipe e passar mais de uma excessao
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}

		Aluno alunoNull = null;
		try {
			Validar.aluno(alunoNull);
			// Apartir do Java 7 ou 8 pide colocar a pipe e passar mais de uma excessao
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}
		// Noa da mais para usar o validar fora de um Try-Catch
		// Validar.aluno(alunoNull);

		// A mensagem de fim só impressa pois os erros foram tratados.
		System.out.println("Fim!");
	}
}
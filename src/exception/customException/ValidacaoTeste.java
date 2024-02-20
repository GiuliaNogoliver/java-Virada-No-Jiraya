package exception.customException;

import exception.basic.Aluno;

public class ValidacaoTeste {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
			// Apartir do Java 7 ou 8 pide colocar a pipe e passar mais de uma excessao
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Aluno alunoNull = null;
			Validar.aluno(alunoNull);
			// Apartir do Java 7 ou 8 pide colocar a pipe e passar mais de uma excessao
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}
		
		// A mensagem de fim só impressa pois os erros foram tratados.
		System.out.println("Fim!");
	}
}
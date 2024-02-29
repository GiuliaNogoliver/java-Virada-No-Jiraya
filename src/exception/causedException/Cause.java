package exception.causedException;

import exception.basic.Aluno;

public class Cause {
	// Podem acontecer exception q causa q desencadeiam outras exception
	// localizar elas é ideal na investigaçao
	public static void main(String[] args) {
			try {
				metodoA(null);
			} catch (IllegalArgumentException e) {
				if(e.getCause() != null) {
					System.out.println(e.getCause().getMessage());
				}
			}
			metodoA(null);
		}
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			// lançar o trhow com caused by
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("O Aluno está Nulo!!");
		}
	}
	
}

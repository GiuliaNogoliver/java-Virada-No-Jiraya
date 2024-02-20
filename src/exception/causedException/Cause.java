package exception.causedException;

import exception.basic.Aluno;

public class Cause {
	// Podem acontecer causar q desencadeiam causar
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
			// lan]ar o trhow com coused by
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("O Aluno está Nulo!!");
		}
	}
	
}

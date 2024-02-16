package streamAPI.others;

import java.util.Arrays;
import java.util.List;

import streamAPI.Aluno;

public class Others {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Giulia", 9.8);
		Aluno a2 = new Aluno("Well", 8.9);
		Aluno a3 = new Aluno("Victor", 8.0);
		Aluno a4 = new Aluno("Giulia", 9.8);
		Aluno a5 = new Aluno("Well", 8.9);
		Aluno a6 = new Aluno("Victor", 8.0);
		Aluno a7 = new Aluno("Sabrina", 8.0);
		Aluno a8 = new Aluno("Breno", 8.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		// Para o distinct funcionar precisa implementar o equals para
		// poder distinguir oq é duplicado
		System.out.println("district...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()	
			.skip(2) //pula os elementos
			.limit(2) // limita
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()	
		.takeWhile(a -> a.getNota()>=7) // enquanto estiverem sido aprovados
		.forEach(System.out::println);
	}
}

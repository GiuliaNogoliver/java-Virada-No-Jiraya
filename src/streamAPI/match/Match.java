package streamAPI.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import streamAPI.Aluno;

public class Match {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Giulia", 9.8);
		Aluno a2 = new Aluno("Well", 8.9);
		Aluno a3 = new Aluno("Victor", 8.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota()>=7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		// A ideia do match é ter funções ja definidas para validar e escrever menos codigo
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(reprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
}

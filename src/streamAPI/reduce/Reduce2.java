package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streamAPI.Aluno;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 8.9);
		Aluno a2 = new Aluno("Bia", 2.6);
		Aluno a3 = new Aluno("Leo", 6.3);
		Aluno a4 = new Aluno("Giu", 8.4);
		Aluno a5 = new Aluno("Gab", 7.3);
		Aluno a6 = new Aluno("Jos", 8.3);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		// Aqui estamos usando o reduce, filter e o map no mesmo Stream
		Predicate<Aluno> passouSemestre = aluno -> aluno.getNota() >= 7;
		Function<Aluno, Double> notas = aluno -> aluno.getNota();
		BinaryOperator<Double> soma = (n1, n2) -> n1 + n2;
		
		
		alunos.parallelStream()
		.filter(passouSemestre)
		.map(notas)
		.reduce(soma)
		.ifPresent(System.out::println);
		
		/*
		 * Parallel Streams podem fazer seu programa mais rápido, 
		 * ou não, e até mesmo mais lento.
		 * Depende de quais operações em Streams você utiliza, 
		 * nem todas são de fato paralelizadas
		 */
	}
}

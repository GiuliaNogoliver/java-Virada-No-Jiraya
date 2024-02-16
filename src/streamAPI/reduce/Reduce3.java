package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streamAPI.Aluno;

public class Reduce3 {
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
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.parallelStream()
		.filter(passouSemestre)
		.map(notas)
		.reduce(new Media(),calcularMedia,combinarMedia);
		
		System.out.println("A media da turma é de " + media.getValor());
	}
}

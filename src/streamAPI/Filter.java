package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 8.9);
		Aluno a2 = new Aluno("Bia", 2.6);
		Aluno a3 = new Aluno("Leo", 6.3);
		Aluno a4 = new Aluno("Giu", 8.4);
		Aluno a5 = new Aluno("Gab", 7.3);
		Aluno a6 = new Aluno("Jos", 8.3);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.name + "! Você foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacao)
			.forEach(System.out::println);
		
		/*alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabéns " + a.name + "! Você foi aprovado(a)!")
			.forEach(System.out::println);*/
		
	}
}

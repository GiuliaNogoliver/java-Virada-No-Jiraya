package streamAPI.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import streamAPI.Aluno;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Giulia", 9.8);
		Aluno a2 = new Aluno("Well", 8.9);
		Aluno a3 = new Aluno("Victor", 8.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		Comparator<Aluno> maiorNota = (aluno1, aluno2) -> {
			if(a1.getNota()>a2.getNota()) return 1;
			if(a1.getNota()<a2.getNota()) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(a1.getNota()>a2.getNota()) return -1;
			if(a1.getNota()<a2.getNota()) return 1;
			return 0;
		};
		
		// Para usar o min e max precisa implementar um comparator
		System.out.println(alunos.stream().max(maiorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		System.out.println(alunos.stream().min(maiorNota).get());
	}
}

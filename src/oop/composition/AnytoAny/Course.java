package oop.composition.AnytoAny;

import java.util.ArrayList;

public class Course {
	final String name;
	final ArrayList<Student> students = new ArrayList<>();

	Course(String name){
		this.name = name;
	}
	//Aqui criamos uma relaçao bidirecional entre alunos e cursos
	void addStudent(Student student) {
		this.students.add(student); // Adiciona o aluno à lista de alunos do curso
		student.courses.add(this); // Adiciona o curso à lista de cursos do aluno
	}
}

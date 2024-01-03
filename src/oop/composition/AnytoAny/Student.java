package oop.composition.AnytoAny;

import java.util.ArrayList;

public class Student {
	final String name;
	// A diferença entre ArrayList e apenas List é a flexibilidade que o uso apenas
	// do list proporciona, list é uma interface generica ent usar esse é mais
	// indicado para boas praticas visto que é mais facil manipular
	final ArrayList<Course> courses = new ArrayList<>();

	Student(String nome) {
		this.name = nome;
	}

	// Aqui criamos uma relaçao bidirecional entre alunos e cursos
	void addCourse(Course course) {
		this.courses.add(course); // Adiciona o curso à lista de cursos do aluno
		course.students.add(this); // Adiciona o aluno à lista de alunos do curso
	}

	Course getCourseByName(String name) {
		for (Course course : this.courses) {
			if (course.name.equalsIgnoreCase(name)) {
				return course;
			}
		}
		return null;
	}

	public String toString() {
		return name;
	}
}

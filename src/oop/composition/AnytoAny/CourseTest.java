package oop.composition.AnytoAny;

public class CourseTest {
	public static void main(String[] args) {

		Student aluno1 = new Student("Giulia");
		Student aluno2 = new Student("Wellington");
		Student aluno3 = new Student("Giovanna");

		Course curso1 = new Course("Java Completo");
		Course curso2 = new Course("Angular 17");
		Course curso3 = new Course("MySql 2023");

		// Posso relacionar o curso acrescentando o aluno nele
		curso1.addStudent(aluno1);
		curso1.addStudent(aluno2);
		
		curso2.addStudent(aluno1);
		curso2.addStudent(aluno3);
		
		// Posso tambem acrescentar o curso ao aluno
		aluno1.addCourse(curso3);
		aluno2.addCourse(curso3);
		aluno3.addCourse(curso3);
		
		for(Student student : curso3.students) {
			System.out.println("Estou matriculado no curso de " + curso3.name);
			System.out.println("e meu nome é " + student.name);
			System.out.println();
		}
		
		System.out.println(aluno1.courses.get(0).students);
		
		Course foundedCourse = aluno1.getCourseByName("Java Completo");
		
		if(foundedCourse != null) {
			System.out.println(foundedCourse.students);
		}
	}
}

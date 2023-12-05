package br.com.classAndMethods.challenge;

public class Supper {
	public static void main(String[] args) {
		Person giulia = new Person("Giulia", 50);

		Food bean = new Food("Feijao", 0.150);
		Food rice = new Food("Arroz", 0.100);
		Food soy = new Food("Soja", 0.200);

		System.out.printf("O peso antes de jantar da Giulia é de %.0fkg", giulia.personWeight);
		giulia.eatFood(bean);
		System.out.printf("Depois de comer o peso total de Giulia é de %f\n", giulia.personWeight);
		giulia.eatFood(rice);
		System.out.println(giulia.show());
		giulia.eatFood(soy);
		System.out.println();
		System.out.printf("Depois da janta o peso total de Giulia é de %f\n", giulia.personWeight);
		System.out.println(giulia.show());
	}

}

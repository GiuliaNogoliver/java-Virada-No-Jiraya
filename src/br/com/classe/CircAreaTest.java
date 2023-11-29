package br.com.classe;

public class CircAreaTest {
	public static void main(String[] args) {

		CircArea a1 = new CircArea(5);
		System.out.println(a1.totalArea());

		CircArea a2 = new CircArea(2);
		System.out.println(a2.totalArea());

		//isso só nao é mais possivel pois botei um final no PI. oq o torna imutavel
		//CircArea.pi = 3.14;
		System.out.println(a1.totalArea());

		// ou seja o valor de pi é direto da classe nao da instancia ent sempre vai dar
		// erro a1.pi = 5; o certo é acessar direto da classe como ta a linha 12.
		
		System.out.println(a2.totalArea());
		System.out.println(a1.totalArea());
		System.out.println(CircArea.totalArea(3));
		System.out.println(Math.PI);
	}
}

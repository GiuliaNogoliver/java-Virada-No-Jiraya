package elementary.challenge;
/*@author Giulia
 @since 1.0*/

public class CircumferenceArea {

	public static void main(String[] args) {

		double raio = 5;
		/*Como o pi nao muda adicionamos o final 
		*para dizer q é uma constante
		*outro ponto é q a palavra PI fica maiuscula pois
		*por convencao a constante é declarada assim*/
		final double PI = 3.14;
		double area = raio * raio * PI;
		
		System.out.println("A Area é igual a " + area + "m2");
	}
}
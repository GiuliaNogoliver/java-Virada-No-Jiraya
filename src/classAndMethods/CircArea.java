package classAndMethods;

public class CircArea {
	double radius;
	static final double PI = 3.1415;
	//o static faz o atributo virar um atributo de classe
	//o final faz o valor da variavel virar uma constante
	
	//Tem o Math.PI q ja entrega o valor
	
	CircArea(double inicialRadius) {
		radius = inicialRadius;
	}

	double totalArea() {
		return Math.pow(radius, 2) * PI;
	}
	
	static double totalArea(double radius) {
		return Math.pow(radius, 2) * PI;
	}
	
}

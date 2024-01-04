package lambdas;

// Quando colocamos essa anotacao significa que esta interface 
// nao pode ter outros metodos abstratos, somente esse
// Normalmente usado para interface de lambdas

@FunctionalInterface
public interface Calculo {
	
	double calcular(double a, double b);
	//int teste();  Note q se descomentar este metodo a classe nao funciona mais
	
	// Pode ter metodos default e static por exemplo
	default String legal() {
		return "legal :)";
	}
	
	// E esses ainda podem ser invocados no main
	static String massa() {
		return "é mt é massa";
	}
}

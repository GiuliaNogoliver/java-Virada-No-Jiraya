package lambdas;

// Quando colocamos essa anotacao significa que esta interface 
// nao pode ter outros metodos, somente esse
// Normalmente usado para interface de lambdas

@FunctionalInterface
public interface Calculo {
	double calcular(double a, double b);
	//int teste();  Note q se descomentar este metodo a classe nao funciona mais
}

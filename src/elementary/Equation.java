package elementary;

public class Equation {
	public static void main(String[] args) {
		
		double a = Math.pow(((3+2)*6), 2)/(2*3);
		System.out.println(a);
		
		double b = (Math.pow((1-5),2) * Math.pow((2-7), 2))/Math.pow(2,2);
		System.out.println(b);
		
		double c = Math.pow(10, 3);
		System.out.println(c);

		double d = Math.pow((a-b),3)/c;
		System.out.println("O Resultado é " + d);
	}
}

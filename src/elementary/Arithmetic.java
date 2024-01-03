package elementary;

public class Arithmetic {
	public static void main(String[] args) {
		var a = 20.50;
		var b = 30.80;
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		//note q ele pediu para fazer o cast pq por inferecia era double
		float c = (float) (b/a);
		String d = String.format("%.4s",c );
		System.out.println(d);
		System.out.println(b % a);
	
		int e = 200;
		int f = 400;
		System.out.println(e + f);
		System.out.println(e - f);
		System.out.println(e * f);
		System.out.println(f / e);
		System.out.println(f % e);
	}
}

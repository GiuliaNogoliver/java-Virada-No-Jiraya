package elementary;

public class NumberToString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		//note q só da para usar o lenght qnd ele ja foi convertido p string
		System.out.println(num1.toString().length());
		
		int num2 = 200000;
		//da p converter o tipo primitivo qnd declarado "Integer."
		System.out.println(Integer.toString(num2).length());
		
		System.out.println("AA" + num1);
		System.out.println("AA" + num2);
		System.out.println(("AA" + num2).length());
	}
}

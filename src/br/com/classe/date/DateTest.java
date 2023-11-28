package br.com.classe.date;

public class DateTest {
	public static void main(String[] args) {
		
		Date now = new Date("inicial date linux");
		
		Date inicial = new Date();
		inicial.printDate();
		
		now.day = 27;
		now.month = 11;
		now.year = 2023;
		
		System.out.printf("%d/%d/%d\n",now.day, now.month, now.year);
		now.printDate();
		System.out.println(now.formatedBrazilDate());
		System.out.println(inicial.formatedBrazilDate());
		System.out.println(now.formatedChineseDate());
	}
}

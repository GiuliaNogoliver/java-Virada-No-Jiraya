package br.com.classe.date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		now.day = 27;
		now.month = 11;
		now.year = 2023;
		
		System.out.printf("%d/%d/%d",now.day, now.month, now.year);
	}
}

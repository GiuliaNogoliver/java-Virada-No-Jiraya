package br.com.classe.date;

public class Date {
	int day;
	int month;
	int year;
	
	String formatedBrazilDate() {
		String formatedDate = day +"/"+ month +"/"+ year;
		return formatedDate;
	}
	String formatedChineseDate() {
		String formatedDate = year + "/" + month + "/" + day;
		return formatedDate;
	}
	
	void printDate() {
		System.out.printf("%d/%d/%d\n",day, month, year);
	}
}

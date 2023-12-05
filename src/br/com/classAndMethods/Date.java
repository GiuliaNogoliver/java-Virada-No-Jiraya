package br.com.classAndMethods;

public class Date {
	int day;
	int month;
	int year;

	//uso do this e this()
	Date() {
		//day = 01;
		//month = 01;
		//year = 1970;
		this(1, 1, 1970);
	}
	
	//byte, short, long, int --> 0
	//float, double --> 0.0
	//boolean --> false
	//chart --> tabela unicode \u0000
	
	//Objetos -> null
	
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	String formatedBrazilDate() {
		String formatedDate = day + "/" + month + "/" + year;
		return formatedDate;
	}

	String formatedChineseDate() {
		String formatedDate = year + "/" + month + "/" + day;
		return formatedDate;
	}

	void printDate() {
		System.out.printf("%d/%d/%d\n", day, month, year);
	}
}

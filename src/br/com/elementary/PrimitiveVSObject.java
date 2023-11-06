package br.com.elementary;

public class PrimitiveVSObject {
	public static void main(String[] args) {

			//os dois sao objetos
			String s = "texto";
			String ss = new String("texto");

			//Wrappers sao a versao objeto dos tipos primitivos
			int a = 123;
			System.out.printf("%d %s %s",a, ss, s);
	}
}
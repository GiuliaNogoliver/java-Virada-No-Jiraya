package br.com.elementary;

public class Wrapper {
	public static void main(String[] args) {
		//byte
		Byte b = 127;
		Short s = 9999;
		Integer i =  999999999;
		Long l = 999999999999999999L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i.floatValue());
		System.out.println(l.intValue());

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Float f = 123.10F;
		Float ff = 133.10F;
		System.out.println(f.compareTo(ff));
		
	/*	Character c = ;
		System.out.println(C.);*/
		
	}
}
package elementary;

public class Work {
	public static void main(String[] args) {
		//ele vai ter o trampo?
		boolean work1 = false;
		boolean work2 = true;
		
		boolean comprouTV50 = work1 && work2;
		boolean comprouTV30 = work1 ^ work2;
		boolean tomaramSorvete = work1 || work2;
		
		
		System.out.println("Ele compra a TV de 30'? " + comprouTV30);
		
		System.out.println("Ele compra a TV de 50\"? " + comprouTV50);
		
		System.out.println("Ele e a familia toma um sorvetin? " + tomaramSorvete);
		
		System.out.println("Todo mundo fica em casa? " + !tomaramSorvete);
	}
}

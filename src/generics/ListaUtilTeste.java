package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		// ele retornara um object por isso precisa do casting
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = (Integer)ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);
		
		// Nao usar generics significa precisar 
		// fazer essas conversoes com casting
		
		
		// Agora com o retorno sendo generico pode tirar o casting
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		// Aqui vc consegue explicitar o tipo junto ao metodo
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimoNumero2);
	}
}

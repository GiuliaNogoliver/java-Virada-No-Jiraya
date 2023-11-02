package fundamental;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipos numericos inteiros
		//por padrao int
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 5428;
		int id = 56789;
		/*note q de 2 para 1 bilhao passa da quantidade dos inteiros
		 *quando coloca L no fim tanto mainsculo quando minusculo vc diz
		 *que ele é um liteal.
		  long pontosAcumulados = 3_234_567_890*/
		long pontosAcumulados = 2_234_567_890L;
		
		//Tipos numericos reais
		//por padrao double
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_897_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo Caracter
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viajens
		System.out.println(numeroDeVoos/2);
		
		//Pontos poe real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + " ganha R$" + salario);
		
		System.out.println("Esta de ferias? " + estaDeFerias);
		
		System.out.println("Esta Ativo? " + status);

	}
}

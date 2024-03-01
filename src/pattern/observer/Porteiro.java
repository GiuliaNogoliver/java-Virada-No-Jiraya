package pattern.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	List<ObservadorChegadaAniversariante> observadores =
			new ArrayList<>();
	
	public void adicionarObservador(ObservadorChegadaAniversariante o) {
		observadores.add(o);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou?");
			valor = entrada.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				// criar evento
				EventoChegadaAniversariante evento = 
						// qnd coloca o new Date seta o dia de hj
						new EventoChegadaAniversariante(new Date());
				
				// notificar observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
				System.out.println("Chegou as " + evento.getMomento());
			} else {
				System.out.println("Alarme falso");
			}
		}
		entrada.close();
	}
}

package lambdas;

public class Threads {
	public static void main(String[] args) {
		// Interfaces antes do java 8, o runnable é uma interface que apenas run
		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {

			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
				}
			}
		};

		/*Runnable trabalho3 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				} catch (Exception e) {

				}
			}
		};*/
		Runnable trabalho3 =  Threads::trabalho3;
		// O uso de thread é para colocar metodos para funcionar ao mesmo tempos
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);

		t1.start();
		t2.start();
		t3.start();
	}
	
	static void trabalho3 () {
		for (int i = 0; i < 100; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}

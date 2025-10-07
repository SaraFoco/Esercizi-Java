package Esercizi;

public class Esercizio05 {
	public static void main(String[] args) {
		
//		 Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa "Zoom", per tutti i multipli di 5 stampa "Boom". Per tutti i multipli di 3 e 5 stampa "Zoom Boom"
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Zoom Boom");
			} else if (i % 5 == 0) {
				System.out.println("Boom");
			} else if (i % 3 == 0) {
				System.out.println("Zoom");
			} else {
			System.out.println(i);
			}
		}
		
		
		
		
	}

}

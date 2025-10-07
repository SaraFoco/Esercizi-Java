package Esercizi;

public class Esercizio01 {
	
	public static void main(String[] args) {
//		Un negozio offre uno sconto speciale ai clienti che soddisfano almeno una di due condizioni: Sono membri del club fedeltà. Hanno speso più di 100 euro nell'ultimo acquisto.
		
		int spesa = 100;
		boolean clubFedelta = true;
		
		if (clubFedelta == false || spesa < 100) {
			System.out.println("Sconto negato");
			String avviso = "";
			if (clubFedelta == false) {
				avviso += "Non sei membro del club Fedeltà";
			}
			if (spesa < 100) {
				avviso += "\nNon hai superato la spesa minima di 100€ ma hai speso: " + spesa;
			}
			System.out.println(avviso);
		} else {
			System.out.println("Congratulazioni, hai ottenuto lo sconto!!");
		}
		
		
	}

}

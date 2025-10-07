package Esercizi;

import java.util.Scanner;

public class Esercizio04 {	
	public static void main(String[] args) {
		
//		Scrivi un programma che prenda in input il numero del mese (1-12) e stampi la stagione corrispondente:

/**Dicembre, Gennaio, Febbraio: "Inverno"
 * Marzo, Aprile, Maggio: "Primavera"
 * Giugno, Luglio, Agosto: "Estate"
 * Settembre, Ottobre, Novembre: "Autunno" */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il numero del mese (1-12): ");
		
		if (scan.hasNextInt()) {
			int numeroDelMese = scan.nextInt();
			switch (numeroDelMese) {
			case 12, 1, 2:
				System.out.println("Inverno");
				break;
			case 3, 4, 5:
				System.out.println("Primavera");
				break;
			case 6, 7, 8:
				System.out.println("Estate");
				break;
			case 9, 10, 11:
				System.out.println("Autunno");
				break;
			default:
				System.out.println("Non riconosco il valore");
				break;
			}
		} else {
			System.out.println("Non hai inserito il numero del mese da 1 a 12. Riprova");
		}
		
		
		
		
		
		
		
	}

}

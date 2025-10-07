package Esercizi;

import java.util.Scanner;

public class Esercizio02 {
	
	public static void main(String[] args) {
		
//		Scrivi un programma che chiede all'utente di inserire un numero compreso tra 10 e 20. Usa l'operatore ||
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Inserisci un numero tra 10 e 20: ");
		int mioNumero = scann.nextInt();
		
		if (mioNumero < 10 || mioNumero > 20) {
			System.out.println("Hai inserito un numero errato.");
		} else {
			System.out.println("Il tuo numero è: " + mioNumero);
		}
		
		
		
		
	}

}

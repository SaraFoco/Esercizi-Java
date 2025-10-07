package Esercizi;

import java.util.Scanner;

public class Esercizio06 {
	public static void main(String[] args) {
		
//		Crea una calcolatrice che continui a chiedere all'utente:

//Due numeri
//Un'operazione (+, -, *, /) Usa switch per gestire le operazioni e while per ripetere finché l'utente non digita "fine".
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Scrivi 2 numeri");
		
		while (true) {
			System.out.println("\nPrimo numero: ");
			double num1 = scan.nextDouble();
			System.out.println("\nSecondo numero: ");
			double num2 = scan.nextDouble();
			
			System.out.println("Scrivi l'operazione da eseguire, oppure digita 'fine' per terminare.");
			String operazione = scan.next();
			
			switch (operazione) {
				case "+":
					System.out.println("Risultato: " + (num1 + num2));
					break;
				case "-":
					System.out.println("Risultato: " + (num1 - num2));
					break;
				case "*":
					System.out.println("Risultato: " + (num1 * num2));
					break;
				case "/":
					System.out.println("Risultato: " + (num1 / num2));
					break;
				case "fine":
					System.out.println("Hai terminato le operazioni!");
					break;
				default:
					System.out.println("Non hai scritto quello che ti ho chiesto. Controlla");
					break;
			}
			
			
			
		}
		
		
	}
}

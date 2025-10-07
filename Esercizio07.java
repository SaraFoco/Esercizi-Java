package Esercizi;

import java.util.Scanner;

public class Esercizio07 {
	public static void main(String[] args) {
		
//		Scrivi un programma che mostri un menu con le seguenti opzioni:
//			Saluta
//			Mostra data
//			Esci 
//		Il programma deve continuare a mostrare il menu finché l'utente non sceglie l'opzione 3. Usa un ciclo do-while.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----MENU-----");
		System.out.println("1-Saluta");
		System.out.println("2-Mostra data");
		System.out.println("3-Esci");
		
		System.out.println("Scrivi il numero corrispondente alla tua scelta: ");
		int menu = scan.nextInt();
		scan.nextLine();
		do {
			if (menu == 1) {
				System.out.println("Ciao utente!!!");
			} else if (menu == 2) {
				System.out.println("Oggi è il 7/10/2025");
			}
			System.out.println("Scegle un opizione: 1-Saluto, 2-Mostra a data, 3-Esci");
			menu = scan.nextInt();
			scan.nextLine();

		}while (menu!=3);
		
		System.out.println("Sei uscito");
			
		}
		
		
	}



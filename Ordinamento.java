package giochi;

import java.util.Arrays;

public class Ordinamento {
	
//	per ogni esercizio crea un metodo a se stante che richiamerai nel main
	
	//Dato il seguente Array inverti l'ordine degli elementi
		//[9,3,5,7,1,] -> [1,7,5,3,9]
	
//	DOMANDA SEMPRE PRESENTE AI COLLOQUI!!!!!!!!!!!!!!!!!!

//	Dato il seguente array ordinali in modo crescente e decrescente
//	[5, 9, 11, 0, 1, 40]
	
//	[5, 9, 6, 10, 7, 11] QUESTO DOPO
	
	
	public static void esercizio1() {
		int [] numeri = {9,3,5,7,1};
		System.out.println("Numeri originali: " + Arrays.toString(numeri));
		for (int i = numeri.length-1; i >= 0; i--) {
			System.out.println(numeri[i]);
		}
		System.out.println();
	}
		
	
	public static void esercizio2CRESC() {
		int [] numeri = {5, 9, 11, 0, 1, 40};
		System.out.println("Numeri originali: " + Arrays.toString(numeri));
		for (int i = 0; i < numeri.length - 1; i++) {
			for (int j = 0; j < numeri.length - i - 1; j++) {
		        if (numeri[j] > numeri[j+1]) {
		            int var = numeri[j];
		            numeri[j] = numeri[j+1];
		            numeri[j+1] = var;
		        }
			}
		}
		System.out.println("Ordine crescente:");
		for (int n : numeri) {
			System.out.println(n);
		}
		
	}
	
	public static void esercizio2DESC() {
		
		int [] numeri = {5, 9, 11, 0, 1, 40};
		for (int i = 0; i < numeri.length - 1; i++) {
		    for (int j = 0; j < numeri.length - i - 1; j++) {
		        if (numeri[j] < numeri[j+1]) {
		            int var = numeri[j];
		            numeri[j] = numeri[j+1];
		            numeri[j+1] = var;
		        }
		    }
		}
		System.out.println("Ordine decrescente:");
		for (int n : numeri) {
			System.out.println(n);
		}
		
	}
	
	public static void esercizio3CRESC() {
		int [] numeri = {5, 9, 6, 10, 7, 11};
		System.out.println("Numeri originali: " + Arrays.toString(numeri));
		for (int i = 0; i < numeri.length - 1; i++) {
			for (int j = 0; j < numeri.length - i - 1; j++) {
		        if (numeri[j] > numeri[j+1]) {
		            int var = numeri[j];
		            numeri[j] = numeri[j+1];
		            numeri[j+1] = var;
		        }
			}
		}
		System.out.println("Ordine crescente:");
		for (int n : numeri) {
			System.out.println(n);
		}
		
	}
	
	public static void esercizio3DESC() {
		
		int [] numeri = {5, 9, 6, 10, 7, 11};
		for (int i = 0; i < numeri.length - 1; i++) {
		    for (int j = 0; j < numeri.length - i - 1; j++) {
		        if (numeri[j] < numeri[j+1]) {
		            int var = numeri[j];
		            numeri[j] = numeri[j+1];
		            numeri[j+1] = var;
		        }
		    }
		}
		System.out.println("Ordine decrescente:");
		for (int n : numeri) {
			System.out.println(n);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		Ordinamento.esercizio1();
		
		Ordinamento.esercizio2CRESC();
		
		Ordinamento.esercizio2DESC();
		
		Ordinamento.esercizio3CRESC();
		
		Ordinamento.esercizio3DESC();

	}


}

package Esercizi;

public class Esercizio03 {
	
	public static void main(String[] args) {
		
//		Sono un docente devo assegnare dei voti. Se il voto è sotto il 70 assegno F, se il voro è sotto 80 assegno C, se il voto è sotto 90 assegno B, se è maggiore di 90 assegno A
		
		int voto = 90;
		if (voto < 70) {
			System.out.println("Hai preso una F.");
		} else if (voto >= 70 && voto < 80) {
			System.out.println("Hai preso una C.");
		} else if (voto >= 80 && voto < 90) {
			System.out.println("Hai preso una B.");
		} else {
			System.out.println("Congratulazioni, hai preso una A!!");
		} 
		
	}

}

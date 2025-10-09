package esercizi_lezione01;

import java.util.Scanner;

public class Esercizio8_ver2 {
	/**
	 * Scrivi un programma che chieda all'utente il voto di tre esami (da 0 a 30).
	 * Calcola la media e stampa:
	 * 
	 * - "Promosso con lode" se la media è maggiore o uguale a 28 - "Promosso" se la
	 * media è maggiore o uguale a 18 - "Bocciato" se la media è minore di 18
	 * 
	 * Inoltre, se almeno un voto è inferiore a 18, stampa anche "Attenzione: hai
	 * almeno un esame insufficiente".
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] voti = new int[3];
		double media = 0;

		for (int i = 0; i < voti.length; i++) {

			System.out.println("Inserisci il voto dell'esame " + (i + 1) + ", il voto va da 0 a 30");

			voti[i] = scan.nextInt();
			
			if (voti[i] >= 0 && voti[i] <= 30) {
				media += voti[i];

			} else {
				System.out.println("Hai inserito un voto non valido, riprova");
				i--;
			}
		}

		// calcolo la media
		media = Math.round(media / voti.length);
		System.out.println("La media dei tuoi esami è: " + media);

		if (media < 18 && media > 0) {
			System.out.println("BOCCIATO");
		} else if (media <= 28 && media >= 18) {
			System.out.println("PROMOSSO");
		} else {
			System.out.println("PROMOSSO con Lode");
		}

	}
}

package esercizi_lezione01;

import java.util.Scanner;

public class RecapWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int scelta = 0;

		do {
			System.out.println("Seleziona una voce del menu");
			System.out.println("---MENU---");
			System.out.println("1. Data di Oggi");
			System.out.println("2. Saluta");
			System.out.println("3. Esci");
			System.out.println("----------");

			if (input.hasNextInt()) {
				scelta = input.nextInt();

				System.out.println("Hai scelto la voce di menu " + scelta);

				switch (scelta) {
				case 1:
					System.out.println("La data di oggi è 09/10/2025");
					break;
				case 2:
					System.out.println("Ciao utente");
					break;
				case 3:
					System.out.println("Hai chiuso il programma");
					break;
				default:
					System.out.println("Scelta non valida");
					break;
				}
			} else {
				System.out.println("Mi spiace, non hai inserito un numero");
				input.next();
			}

		} while (scelta != 3);

		input.close();
	}
}

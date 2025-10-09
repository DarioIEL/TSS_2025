package esercizi_lezione01;

import java.util.Scanner;

public class Esercizio4 {
	/**
	 * 4. Esercizio4 Scrivi un programma che prenda in input il numero del mese
	 * (1-12) e stampi la stagione corrispondente:
	 * 
	 * - Dicembre, Gennaio, Febbraio: "Inverno" - Marzo, Aprile, Maggio: "Primavera"
	 * - Giugno, Luglio, Agosto: "Estate" - Settembre, Ottobre, Novembre: "Autunno"
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numMese;
		
		do {
			System.out.println("Inserisci un numero del mese, ti risponderò con la relativa stagione. Per chiudere il programma digita 100");
			numMese = scan.nextInt();
			
			switch (numMese) {
			case 12:
			case 1:
			case 2:
				System.out.println("Sei in inverno");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Sei in primavera");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Sei in estate");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Sei in autunno");
				break;
			case 100:
				System.out.println("Stai chiudendo il programma");
				break;
			default:
				System.out.println("Hai inserito un numero di mese errato");
				break;
			}

		} while (numMese != 100);

	}
}

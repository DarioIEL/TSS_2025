package esercizi_lezione01;

import java.util.Date;
import java.util.Scanner;

public class Esercizio7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Caro utente, seleziona una voce del menu");
	
		String scelta = "";
		
		while(!scelta.equalsIgnoreCase("Esci")) {
				
			System.out.println("Seleziona una voce del menu");
			System.out.println("---MENU---");
			System.out.println("1. Data di Oggi");
			System.out.println("2. Saluta");
			System.out.println("3. Esci");
			System.out.println("----------");
			
			scelta = scan.nextLine();
			
			System.out.println("Hai scelto la voce di menu " + scelta);

			switch (scelta) {
			case "data":
			case "1":
				Date dataOggi = new Date();
				System.out.println("La data di oggi è " + dataOggi);
				break;
				
			case "saluta":
			case "2":
				System.out.println("Chi vuoi salutare ? Inserisci il suo nome");
				String nomeUser = scan.nextLine();
				System.out.println("Ciao " + nomeUser + " sai chi ti saluta ?!");
				
				break;
				
			case "3":
			case "Esci":
				System.out.println("Hai chiuso il programma");
				break;
				
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}
		
		
		
		
		
	}
}

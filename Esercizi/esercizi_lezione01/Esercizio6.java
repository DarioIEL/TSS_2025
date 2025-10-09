package esercizi_lezione01;

import java.util.Scanner;

public class Esercizio6 {
	/**
	 * 6. Esercizio6 Crea una calcolatrice che continui a chiedere all'utente: - Due
	 * numeri - Un'operazione (+, -, *, /) Usa switch per gestire le operazioni e
	 * while per ripetere finché l'utente non digita "fine".
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String uscita = "";

		while (!uscita.equalsIgnoreCase("fine")) {
			System.out.println("Benvenuto nella calcolatrice, vuoi calcolare qualcosa(digita OK) o vuoi uscire (per uscire digita 'fine'");
			
			uscita = scan.nextLine();
			if(uscita.equalsIgnoreCase("fine")) {
				System.out.println("Sei uscito dal programma");
				break;
			}

			System.out.println("Inserisci il primo numero");
			double n1 = scan.nextDouble();

			System.out.println("Inserisci il secondo numero");
			double n2 = scan.nextDouble();

			System.out.println("Inserisci un'operazione da svolgere: + - * / :");
			String op = scan.next();

			switch (op) {
			case "+":
				double somma = n1 + n2;
				System.out.println("La somma vale: " + somma);
				break;

			case "-":
				double sottrazione = n1 - n2;
				System.out.println("La sottrazione vale: " + sottrazione);
				break;

			case "*":
				double moltiplicazione = n1 * n2;
				System.out.println("La moltiplicazione vale " + moltiplicazione);
				break;
			case "/":
				double divisione = n1 / n2;
				System.out.println("La divisoone vale: " + divisione);
				break;
			default:
				System.out.println("Operazione non consentita");
				break;
			}
			//Questa riga sotto serve a pulire lo scanner
			String line = scan.nextLine();
		}

	}
}

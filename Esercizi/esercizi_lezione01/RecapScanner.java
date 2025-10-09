package esercizi_lezione01;

import java.util.Scanner; 

public class RecapScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome per essere salutato");
		String nome = scan.nextLine();
		
		System.out.println("Ciao " + nome);
	}
}

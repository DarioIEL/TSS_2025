package lezione02_Statement;

public class Recap {

	public static void main(String[] args) {
		
//		Le variabili sono aree di memoria alle quali associamo un nome
/**
 * 		Regole di denominazione:
 * 		- Non possono cominciare con numeri
 * 		- Possono contenere numeri e lettere
 * 		- NO keyword Java (private, default, byte, final)
 * 		- solitamente in camelCase
 * 		- La dichiarazione è indipendente dalla valorizzazione
 */
		
		//DICHIARO E ASSEGNO sulla stessa riga
//		String nomeCorso = "TSS-2025";
		
		//DICHIARO
		String nomeCorso;
		
		//ASSEGNO
		nomeCorso = "TSS_2025";

		//LEGGO o STAMPO
		System.out.println(nomeCorso);
		
		//RIASSEGNO
		nomeCorso = "TSS_2026";
		
		System.out.println(nomeCorso);
		
		//TIPI PRIMITIVI
		int numeroStudenti = 11;
		double metaStudenti = 5.5;
		
		byte num1 = 10;
		char lettera = 'f';
		boolean piove = true;
		
		
		//COSTANTI, non possono essere riassegnate. final è un MODIFICATORE
		final double PI = 3.14;
		final double IVA = 0.22;
		
		final int MAX_VALUE = 100;
		final int MIN_VALUE = 1;
		
		//MIN_VALUE = 2; errore, poiché non le posso riassegnare	
		
		
		
	}
}

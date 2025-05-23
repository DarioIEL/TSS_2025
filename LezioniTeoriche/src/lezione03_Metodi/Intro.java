package lezione03_Metodi;

import java.util.Scanner;

public class Intro {
	
//	Metodo: termine legato alla OOP
//	servono a wrappare codice, mettere codice sotto un unico nome. 
//	Permettono di scomporre un problema in sottoproblemi.
//	Re-use del codice
	
/**
 *  SINTASSI:
 *  
 *  static: il metodo appartiene alla classe e non all'istanza
 *  
 *  (modificatori) (tipo restituito) (nome del metodo) (argomenti o parametri)
 *  
 *  (					FIRMA DEL METODO 							   )
 *  		
 *  public static  		void  		 	   main			(String[] args){
 *  		
 *  ....body del metodo...
 *  
 *   OPZIONALE: 
 *   return qualcosa; (il return restituisce qualcosa)
 *  }
 */
	
	public static void main(String[] args) {
		System.out.println("Ciao dal metodo main");
		
		//Richiamo salutaUser(). 
		//Uso la logica funzionale poiché ho indipendenza tra dichiarazione e richiamo del metodo
		salutaUser();
		
		//Al metodo sotto devo passare un argomento, un parametro o più
		salutaDocente("Pippo", "Rossi");
		salutaDocente("Anna Lanzullo");
		salutaDocente("Pierluigi", "Pierantola", 61);
		salutaDocente();
		
		String[] nomiProfs = {"Laura Verdi", "Luca Gialli", "Andrea Andreoni", "Marco Marca"};
		
		for (String nomeCogn : nomiProfs) {
			salutaDocente(nomeCogn);
		}
		
		
	}

//	QUESTO è un METODO
	public static void salutaUser() {
		//Dentro il metodo la logica sarà sempre imperativo/procedurale.
		
		System.out.println("Ciao, Dario! ");
		System.out.println("Qual è il tuo cognome ?");
		Scanner in = new Scanner(System.in);
		System.out.println("Allora: ciao, DArio " + in.nextLine());
	}
	
	
	public static void salutaDocente(String nomeDoc, String cognomeDoc) {
		System.out.println("Buongiorno docente "  + nomeDoc +  " " + cognomeDoc);
		//Non sono obbligato a usare etaDoc
	}
	
	//OVERLOADING: sovraccarico del metodo per poter avere più o meno dei parametri
	public static void salutaDocente(String nomeDoc, String cognomeDoc, int etaDoc) {
		System.out.println("Esimio docente " + nomeDoc + " " + cognomeDoc + ". Adesso so anche quanti anni ha!!");
		int etaPensione = 65;
		int anniRestanti = etaPensione - etaDoc;
		System.out.println("Le mancano " + anniRestanti + " alla pensione");
		}
	
	public static void salutaDocente(String nomeCognome) {
		System.out.println("Buogniono docente " + nomeCognome);
	}
	
	public static void salutaDocente() {
		System.out.println("Buongiorno docente");
	}
}

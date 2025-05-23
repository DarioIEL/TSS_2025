package lezione06_aggreg;

import lezione07_Composizione.Stanza;

public class Main {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("La versione di Barney", new Autore("Mordecai", "Richler"));
		Libro l2 = new Libro("Follia", new Autore("Patrick", "McGrath"));
		Libro l3 = new Libro("Delitto e castigo", new Autore("Fedor", "Dostoevskij"));
		
		Biblioteca bibliotecaComunale = new Biblioteca("Biblioteca comunale");
		bibliotecaComunale.addLibro(l1);
		bibliotecaComunale.addLibro(l2);
		bibliotecaComunale.addLibro(l3);
		
		bibliotecaComunale.stampaListaLibri();
		

	}
	
	
}

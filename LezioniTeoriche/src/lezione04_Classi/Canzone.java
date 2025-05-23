package lezione04_Classi;

public class Canzone {

	String cantante;
	String titolo;
	double durata;
	
	
	//Il costruttore di default esiste sempre. Può essere anche non specificato se non esiste il costruttore a firma piena
	public Canzone() {}

	
//	Essendo in presenza di un costruttore a firma piena e voglio utilizzare un costruttore di default allore devo per forza specificare quest'ultimo.
	public Canzone(String cantante, String titolo, double durata) {
		this.cantante = cantante;
		this.titolo = titolo;
		this.durata = durata;
	}


	public Canzone(String cantante, String titolo) {
		this.cantante = cantante;
		this.titolo = titolo;
	}


	@Override
	//con il metodo to String ottengo una rappresentazione formato stringa del mio oggetto
	//Att: anche il toString() può essere invocato senza essere specificato
	public String toString() {
		if(durata == 0) {
			return "cantante: " + cantante + " - titolo: " + titolo ;
		}else {			
			return "cantante: " + cantante + "- titolo: " + titolo + " - durata: " + durata ;
		}
	}

	
	
	
	
}

package lezione07_Composizione;

public class Main {
	public static void main(String[] args) {
		Casa miaCasa = new Casa("via Carlo Alberto 22");
		miaCasa.aggiungiStanza(new Stanza("Studio", 12));
		miaCasa.aggiungiStanza(new Stanza("Cucina", 20));
		miaCasa.aggiungiStanza(new Stanza("Bagno", 8));
		miaCasa.aggiungiStanza(new Stanza("Camera da letto", 25));
		
		miaCasa.visualizzaStanze();
		
		//Prop size() degli ArrayList. Equivalente di length negli array
		System.out.println("Nella mia casa ci sono: " + miaCasa.stanze.size());
	}
}

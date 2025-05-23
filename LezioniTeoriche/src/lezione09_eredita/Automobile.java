package lezione09_eredita;

//Per mettere in atto l'ereditarietà uso la parola chiave extends
public class Automobile extends Veicolo {
	
	//prop aggiuntiva che specializza il mio Veicolo Automobile
	private int numPorte;

	public Automobile(String marca, String modello, int annoProd, int numRuote, int numPorte) {
		//super è il costruttore della superclasse Veicolo
		super(marca, modello, annoProd, numRuote);
		this.numPorte = numPorte;
	}

	public void accendiAC() {
		System.out.println("Sto accendendo AC della mia Automobile");
	}


	//Sovrascrivo i metodi della mia superclasse, non è obbligatorio
	@Override
	public void start() {
		System.out.println("Hai messo in moto la tua Automobile"); 
	}

	
	//NON sovrascrivo lo stop
	
	
	//Sovrascrivo il metodo mostraInfo() aggiungendo un pezzo
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Numero porte: " + this.numPorte);
	}
	




}

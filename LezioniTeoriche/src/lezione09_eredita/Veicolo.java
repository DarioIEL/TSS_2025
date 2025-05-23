package lezione09_eredita;

//QUESTA è la mia superclasse
public class Veicolo {
	//campi dichiarati protected fanno si che queste prop vengano viste solo dalla classe stessa e da chi eredita
	protected String marca;
	protected String modello;
	protected int annoProd;
	protected int numRuote;
	protected String nomeVeicolo = "Veicoloooooo!";

	//costruttore
	public Veicolo(String marca, String modello, int annoProd, int numRuote) {
		this.marca = marca;
		this.modello = modello;
		this.annoProd = annoProd;
		this.numRuote = numRuote;
	}
	
	//metodi
	public void start() {
		System.out.println("Hai avviato il veicolo");
	}
	
	public void stop() {
		System.out.println("Hai fermato il veicolo");
	}

	public void mostraInfo() {
		System.out.println("Veicolo: " + this.marca + " " + this.modello + "(anno: " + this.annoProd + ")" + "Numero ruote: " + this.numRuote);
	}
	
	
	
	
}

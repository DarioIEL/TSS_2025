package lezione04_Classi;

public class Bicicletta {

	//In questo caso sto direttamente assegnando delle prop
	final byte numeroRuote = 2;
	byte marcia = 6;
	int frequenza = 0;
	double velocita = 0;
	
	final String marca = "Cannondale";
	String modello = "C-Bike-ale";
	String tipoBici = new String("stradale");
	
	//in questo caso il costruttore me lo posso risparmiare
	
	public void accelera (int incFrequenza) {
		frequenza += incFrequenza;
		System.out.println("Stai accelerando. La frequenza attuale è: " + frequenza);
	}
	
	public void rallenta (int incFrquenza) {
		frequenza -= incFrquenza;
		System.out.println("Stai rallentando. La frequenza attuale è: " + frequenza);
	}
	
	public void calcolaVelocita() {
		velocita = frequenza * marcia;
		System.out.println("La tua vel attuale è: " + velocita);
	}

	@Override
	public String toString() {
		return "Bicicletta [numeroRuote=" + numeroRuote + ", marcia=" + marcia + ", frequenza=" + frequenza
				+ ", velocita=" + velocita + ", marca=" + marca + ", modello=" + modello + ", tipoBici=" + tipoBici
				+ "]";
	}

	
}



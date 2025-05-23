package lezione09_eredita;

public class Motocicletta extends Veicolo {

	private String tipo;
	private static int numRuote = 2;

	public Motocicletta(String marca, String modello, int annoProd, String tipo) {
		super(marca, modello, annoProd, numRuote);
		this.tipo = tipo;
	}

	@Override
	public void start() {
		System.out.println("Hai avviato la tua motocicletta");
	}

	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Tipo di moto: " + this.tipo);
	}

	//POSSO AVERE ANCHE METODI TIPICI SOLO DI QUESTA CLASSE
	public void impenna() {
		System.out.println("VROOOOOOOO sto impennando la moto!!");
	}
}

package lezione11_Astrazione;

public class Rettangolo extends FormaGeometrica {

	private double larghezza;
	private double lunghezza;
	
	//ATT: sono obbligato a dichiarae il costruttore poiché nella superclasse ho dichiarato un costruttore non di defualt...Regola generale...
	public Rettangolo(Colore colore, double larghezza, double lunghezza) {
		super("Rettangolo", colore);
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
	}

	@Override
	double calcolaArea() {
		return this.lunghezza * this.larghezza;
	}

	@Override
	double calcolaPerimetro() {
		return 2 * (larghezza + lunghezza) ;
	}

}

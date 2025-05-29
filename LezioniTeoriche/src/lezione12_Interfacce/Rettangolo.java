package lezione12_Interfacce;

public class Rettangolo implements FormaCalcolabile{

	private double lunghezza;
	private double altezza;
	
	
	
	public Rettangolo(double lunghezza, double altezza) {
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return this.lunghezza * this.altezza;
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (this.altezza + this.lunghezza);
	}


	
}

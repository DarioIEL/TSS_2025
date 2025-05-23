package lezione11_Astrazione;

public class Cerchio extends FormaGeometrica {

	private double raggio;
	
	
	public Cerchio(Colore colore, double raggio) {
		super("Cerchio", colore);
		this.raggio = raggio;
	}

	
	//ATT: QUESTI DUE METODI QUA SOTTO SONO OBBLIGATO AD IMPLEMENTARLI, POICHé DICHIARATI ABSTRACT NELLA SUPERCLASS
	
	@Override
	double calcolaPerimetro() {
		return 2 * Math.PI * this.raggio;
	}

	@Override
	double calcolaArea() {
		return Math.PI * Math.pow(this.raggio, 2);
	}

}

package lezione05_RelazioneTraClassi;

public class Punto {

	double x;
	double y;

	//ATT: specifico il costruttore di default solo se ho intenzione di utilizzarlo e mi trovo in presenza di un costruttore a firma piena
	public Punto() {
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}

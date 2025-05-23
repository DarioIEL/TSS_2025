package lezione11_Astrazione;

public abstract class FormaGeometrica {

	//POSSO AVERE DELLE PROP
	protected String nome;
	protected Colore colore;
	
	//Posso avere (ma anche no) un costruttore anche se la classe astratta non è istanziabile. Però questo costruttore "me lo gioco" nella sottoclasse richiamando super();
	public FormaGeometrica(String nome, Colore colore) {
		this.nome = nome;
		this.colore = colore;
	}
	
	//Posso avere metodi CONCRETI
	public void mostraInfo() {
		System.out.println("Forma: " + this.nome + " Colore: " + this.colore);
	}

	//Metodo astratto nella classe astratta ---> NON HO IMPLEMENTAZIONE
	abstract double calcolaArea();
	abstract double calcolaPerimetro();
}

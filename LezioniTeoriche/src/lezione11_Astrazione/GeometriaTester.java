package lezione11_Astrazione;

public class GeometriaTester {

	public static void main(String[] args) {
		
		//1. NON POSSO ISTANZIARE UNA CLASSE ASTRATTA
//		FormaGeometrica fG = new FormaGeometrica(); NO
		
		//2. Posso tranquillamente istanziare le sottoclassi
		Cerchio cerchio = new Cerchio(Colore.BLU , 6);
		System.out.println(cerchio.calcolaArea());
		System.out.println(cerchio.calcolaPerimetro());
		cerchio.mostraInfo(); //ATT: questo metodo (concreto) esiste solo nella super classe
		
		
		Rettangolo rettangolo = new Rettangolo(Colore.ROSSO, 12.5, 5.3);
		System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
		System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
		rettangolo.mostraInfo();
		
		//Polimorfismo con classe astratta
		FormaGeometrica formaG = new Cerchio(Colore.VERDE, 5.9); //Questo funziona
		
	}

}

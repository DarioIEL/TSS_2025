package lezione03_Metodi;

public class UsoMetodiDiAltri {

	public static void main(String[] args) {
		//A patto che sia public io posso utilizzare un metodo static di un'altra classe
		String qualcosa = MetodiAusiliari.cosaMiPassi("Qualcosa ti passerò");
		System.out.println(qualcosa);
		
		double somma = Calcolatrice0.addizione(5.2, 8.9);
		System.out.println("Il valore della somma è " + somma);
	}
	
}

package lezione12_Interfacce;


public interface FormaCalcolabile {
	
	//Metodi
	double calcolaArea();
	double calcolaPerimetro();
	
	String TIPO = "Forma Geometrica calcolabile";
	
	//metodi di default 
	default void stampaInfoForma() {
		System.out.println("Area Forma " + this.calcolaArea());
		System.out.println("Perimetro Forma " + this.calcolaPerimetro());
	}
	
	static void benvenuto() {
		System.out.println("Benvenuto nella geometria piana euclidea calcolabile");
	}
	
	//DOPO
//	@FunctionalInterface
//	int faiUnCalcolo(int a, int b);

}

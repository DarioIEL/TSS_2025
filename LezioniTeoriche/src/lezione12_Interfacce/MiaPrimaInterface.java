package lezione12_Interfacce;

public interface MiaPrimaInterface {

	// Dichiaro dei metodi senza implementazione (sono di default dichiarati public abstract)
	void primoMetodo();
	String secondoMetodo();
	Integer terzoMetodo();
	Boolean quartoMetodo();
	
	//Posso anche dichiarare delle prop (implicitamente public abstract final)
	int COSTANTE = 1;

	
	//Da JAVA8+ posso anche inserire l'implementazione dei metodi 
	static void metodoDefaultDellaInterfaccia() {
		
		System.out.println("Sono un metodo statico dell'interfaccia");
	}
	
	//metodo Default
	default void metodoSoloDefault() {
		System.out.println("Questo è un metodo di default");
	}
}

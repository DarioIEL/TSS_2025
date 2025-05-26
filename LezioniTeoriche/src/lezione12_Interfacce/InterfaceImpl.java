package lezione12_Interfacce;

public class InterfaceImpl implements MiaPrimaInterface {

	@Override
	public void primoMetodo() {
		// TODO Auto-generated method stub
		System.out.println("Sono nella classe e questo è il primo metodo");
	}

	@Override
	public String secondoMetodo() {
		String salutaMetodo = "Ciao dal secondo metodo ";
		return salutaMetodo;
	}

	@Override
	public Integer terzoMetodo() {
		int somma = 5+6;
		return somma;
	}

	@Override
	public Boolean quartoMetodo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

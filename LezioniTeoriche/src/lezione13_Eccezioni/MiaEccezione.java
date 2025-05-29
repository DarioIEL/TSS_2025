package lezione13_Eccezioni;

public class MiaEccezione extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Questo è il messsaggio dell'eccezione personalizzata !!";
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

	public String dettagliEccezione() {
		System.out.println("Questi sono i dettagli della mia eccezione: ");
		return "Dettagli eccezione: sono in un Null Pointer Exception";
	}
	
}

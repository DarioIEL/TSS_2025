package lezione12_Interfacce;

public class TesterForme {
	public static void main(String[] args) {
		
		FormaCalcolabile.benvenuto(); //lo uso come un semplice metodo static
		
		Cerchio mioCerchio = new Cerchio(5.2);

		System.out.println("L'area del cerchio vale: " + mioCerchio.calcolaArea() );
		System.out.println("Il perimetro del cerchio vale: " + mioCerchio.calcolaPerimetro() );
		
		
		Rettangolo mioRettangolo = new Rettangolo(4.3, 8.2);
		System.out.println("L'area del rettangolo vale: " + mioRettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo vale: " + mioRettangolo.calcolaPerimetro());
		mioRettangolo.stampaInfoForma();
		
		
		//Array di FormeCalcolabili
		FormaCalcolabile[] mieforme = {mioCerchio, mioRettangolo};
		for (FormaCalcolabile fC : mieforme) {
			System.out.println(fC.calcolaArea());
		}
		
		
		//DOPO 
//		FormaCalcolabile formCalc = (a,b) -> a + b;
//		int risultato = formCalc.faiUnCalcolo(8, 9);
	}
}

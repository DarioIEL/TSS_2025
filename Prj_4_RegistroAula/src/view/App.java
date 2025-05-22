package view;

import controller.RegistroCtrl;
import model.Registro;
import model.Studente;

public class App {

	public static void main(String[] args) {
		
//		Studente mioStud = new Studente("Dario", "Mennillo", "TSS", 2);
//		System.out.println(mioStud.getToken()); 
		Registro tss2025 = new Registro("TSS 2025");
		RegistroCtrl regCtrl = new RegistroCtrl(tss2025);
		regCtrl.caricaStudentiDaFile();
		regCtrl.faiAppello();
		
		Studente nuovoStud = new Studente("Pier", "Pier", "TSS", 15);
		regCtrl.aggiungiStudenteSuFile(nuovoStud, "./elencoStudenti_TSS.csv");
	}
}

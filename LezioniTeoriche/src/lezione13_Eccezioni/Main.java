package lezione13_Eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("./testo.txt"); //sto appositamente sbagliando il nome del file
		System.out.println(f.exists());
		
		//Uso il fileReader
		try {
			//Mi viene suggerito di circondare con un try & catch proprio perché parliamo di Eccezioni di tipo CHECKED
			FileReader fr = new FileReader(f); 
			System.out.println("Il file esiste");
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		//Esempio di eccezione UNCHECKED. queste le posso gestire senza try&catch
		try {
			stampaTesto(null);  
			
		} catch (Exception e) {
			System.out.println("Stai utilizzando un testo nullo");
		}
		
//		dividi(0);
		
//		esegui(null);
		
		Scanner sc = new Scanner(System.in);
		String parola = sc.nextLine();
		esegui2(parola);
	}
	
	
	//ECCEZIONE UNCHECKED gestita attraverso un if
	
//	private static void stampaTesto(String testo) {
//		if(testo != null) {
//			String tmp = testo.concat("....");
//			System.out.println(tmp);
//		}else {
//			System.out.println("Mi hai passato un testo vuoto");
//		}
//	}
	
	
	//Eccezione gestita attraverso un Try&Catch
//	private static void stampaTesto(String testo) {
//		try {
//			
//			int val = 10;
//			if(testo != null && testo.length() < val) {
//				System.out.println("Il tuo testo ha meno di " + val + " caratteri");
//			}else {				
//				String tmp = testo.concat("..."); 
//				System.out.println(tmp);
//			}
//			
//		} catch (Exception e) {
//			
//			System.out.println("Guarda che mi stai passando un testo null");
////			e.printStackTrace();
////			System.out.println(e);
//		}finally {
//			System.out.println("Il finally verrà sempre eseguito" );
//		}
//	}
	
	
//	private static void dividi(int numero) {
//		int mioNum = 5;
//		try {
//			int divisione = mioNum / numero;
//			System.out.println(divisione);
//			
//		} catch (ArithmeticException e) {
//			
//			System.out.println("Bello, stai dividendo per 0");
//		}
//	}
	
	
	//ALTRO MODO DI GESTIRE LE ECCEZIONE ---  THROWS
	//Con il throws sto demandando chi eseguirà questo metodo la gestione attraverso un try&catch
	private static void stampaTesto(String testo) throws NullPointerException{
		
		String tmp = testo.concat("....");
		System.out.println(tmp);
		
	}

	private static void esegui(String testo) {
		try {
			stampaTesto(testo);			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	//CON eccezione personalizzate
	private static void stampaTesto2(String testo) throws MiaEccezione{
		if(testo == null) {
			throw new MiaEccezione();
		}else {
			System.out.println("Questo è il testo " + testo);
		}
	}
	
	private static void esegui2(String testo) {
		try {
			stampaTesto2(testo);
		} catch (MiaEccezione miaE) {
			String msg = miaE.getMessage();
			String dettagli = miaE.dettagliEccezione();
			System.out.println(msg);
			System.out.println(dettagli);
			miaE.printStackTrace();
		} catch (Exception e) {
			System.out.println("Si è verificata un'eccezione generalizzata");
		}finally {
			System.out.println("Questo verrà sempre eseguito");
		}
	}
	
	
	
}

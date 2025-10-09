package esercizi_lezione01;


public class Esercizio5 {
	/**
	 * 5. Esercizio5
Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa "Zoom", per tutti i multipli di 5 stampa "Boom". Per tutti i multipli di 3 e 5 stampa "Zoom Boom"
	 */
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) { 
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " ZOOM BOOM");
			}else if(i%3==0) {
				System.out.println(i + " ZOOM");
			}else if(i%5==0) {
				System.out.println(i + " BOOM");
			}else {
				System.out.println(i);
			}
		}
		
		
	}
}

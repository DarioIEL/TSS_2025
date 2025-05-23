package lezione02_Statement;

public class Operatori_Logici {
public static void main(String[] args) {
	
	//Gli operatori logici mi permetto di espandere le condizioni, quindi di valutare più cose
	
	/**
	 * && AND 
	 * || OR
	 *  ! NOT
	 */
	
	//Esempio trimestri dell'anno
	int meseAttuale = 5;
	
	if(meseAttuale >= 1 && meseAttuale <= 3) {
		System.out.println("Siamo nel primo trimestre");
	}else if(meseAttuale >= 4 && meseAttuale <= 6) {
		System.out.println("Siamo nel secondo trimestre");
	}else if(meseAttuale == 5) {
		System.out.println("Sei a Maggio"); //NON POTRà MAI essere eseguito
	}else if(meseAttuale >= 7 && meseAttuale <= 9) {
		System.out.println("Siamo nel terzo trimestre");
	}else if(meseAttuale >= 10 && meseAttuale <= 12){
		System.out.println("Siamo nel quarto trimestre");
	}else {
		System.out.println("Valore non riconosciuto");
	}
	
	
	
	//Esempio festa. Per entrare alla festa devo avere un invito ed essere maggiorenne
	
	boolean invito = true;
	int miaEta = 36;
	
	if(miaEta >= 18 && invito) {
		System.out.println("Benvenuto, puoi entrare");
	}else if(miaEta < 18 && invito) {
		System.out.println("Mi spiace, non hai l'età per entrare, pur avendo l'invito");
	}else if(miaEta >= 18 && !invito) {
		System.out.println("Mi spiace, hai l'età giusta ma non hai l'invito");
	}else {
		System.out.println("Non puoi entrare, non hai né l'età giusta nè l'invito");
	}

	//Esempio esame università. Professore buono. Ti metto un voto anche con un solo esame superato tra scritto e orale. Il voto finale sarà il maggiore.
	
	int scritto = 24;
	int orale = 14;
	
	if(scritto >= 18 || orale >= 18) {
		System.out.println("Complimenti hai superato l'esame");
	}else {
		System.out.println("Mi spiace, non hai superato l'esame");
	}
	
	


}

}

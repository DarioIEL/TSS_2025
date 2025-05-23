package lezione02_Statement;

public class For_Statement {
	public static void main(String[] args) {
		
		//FOR: Cicli definiti
		int num = 1;
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Ciao " + i);
		}
		
		System.out.println("--------------");
		//ciclo inverso
		for(int i = 10; i >= 0; i--) {
			System.out.println("Ciao " + i);
		}
		
		//for con doppia variabile
		for(int a = 0, b = 9; b >= 0; b--, a++) {
			System.out.println("a vale " + a + " b vale " + b);
		}
		
		//For con continue: serve a "saltare un giro"
		System.out.println("-------For con il continue-------");
		for(int i = 0; i < 10; i++) {
			if(i%2 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
		//For con break: interrompe il ciclo
		System.out.println("----------for con il break-------");
		for(int i = 1; i < 10; i++) {

			if(i%3 == 0) {
				break;
			}
			
			System.out.println(i);
		}
		
		
	}
}

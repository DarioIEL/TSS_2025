package lezione01_Intro;

public class Operatori {
	public static void main(String[] args) {
		//operatori matemtici +*-/
		// % resto della divisione o Modulo
		
		int resto = 12 % 6;
		System.out.println("Il resto vale: " + resto);
		
		int resto2 = 12 % 3;
		System.out.println("Il resto vale: " + resto2 + " quindi è un multiplo di 3");
		
		
		//Operatori di confronto o relazionali -> producono sempre un boolean
		// == (uguale a )
		// != (diverso)
		// > (maggiore) <  (minore) >= (maggiore uguale) <= (minore uguale)
		
		int i1 = 5;
		int i2 = 6;
		
		boolean c1 = (i1 == i2); //false
		boolean c2 = (i1 != i2); //true
		boolean c3 = (i1 > i2) ; //false
		boolean c4 = (i1 < i2); //true
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		//Operatori di assegnamento
		// = (assegnamento) += (assegnamento con somma) -= (assegnamento con sottrazione)
		// *= (assegnamento con molt) /= (assegnamento con divisione)
		
		int num1 = 10;
		int num2 = 5;
		
		//System.out.println(num1 += num2); //sto incrementando num1 --> num1 = num1 + num2
		//num1 = num1 + num2;
		num1 += num2; //num1 = num1 + num2
		System.out.println(num1); //15 perché incrementato
		System.out.println(num2); // 5
		
		
		num2 *= 4; // num2 = num2 * 4;
		System.out.println(num2); //20
		
		num2 /= 5; //num2 = num2 / 5
		System.out.println(num2); //4
		
		num2 -= 2;
		System.out.println(num2);//2
		
		
		//operatori di incremento (++) e decremento (--) aumentano o dim di 1 il valore della variabili
		
		
		int a = 3;
		int b;
		
		System.out.println("a vale " + a);
		a++;
		System.out.println("Dopo a++ la a vale: " + a);
		
		b = a++; //operatore di post incremento (prima legge poi incrementa)
		System.out.println("b vale: " + b);
		
		b = ++a; //operatore di pre incremento (prima incrementa poi legge)
		System.out.println("b vale: " + b);
		
		System.out.println(a);
		
		int c = 0;
		System.out.println(c++);
		System.out.println(c);
		
	}
}

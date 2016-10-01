
public class ArithmeticOperations {
	
	public static void main(String[] args) {
		
		int a = 9;
		int b = 5;

		System.out.println("a="+a+", b="+b);
		//Variante 1: Berechne die Ergebnisse direkt in der Ausgabe.
		//Achte darauf, dass die Berechnungen immer in einem
		//geklammerten Ausdruck stattfinden müssen z.B. (a+b),(a-b),...
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		//Leerzeile als Platzhalter
		System.out.println();
		
		//Variante 2: Verwende eine weitere Variable namens
		//result vom Typ int zum Zwischenspeichern der Ergebnisse.
		System.out.println("a="+a+", b="+b);
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		result = a % b;
		System.out.println(a + " % " + b + " = " + result);
		
	}
	
}

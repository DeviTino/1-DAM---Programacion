package Ej2;

public class Suma {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 1;
		int d = 0;
		
		
		//Para esta parte e utilizado "\n" que lo que hace es pasar la siguiente parte del texto hacia debajo
		
		System.out.println("Parte 1");
		
		System.out.println("4\n+\n7\n=\n" + (a + b));
		
		System.out.println("--------------------------------");
		System.out.println("4 + 7\n= " + (a + b));
		System.out.println("--------------------------------");
		System.out.println("4 + 7 = (" + (a + b) + ")");
		
		System.out.println("--------------------------------");
		System.out.println("Parte 2");
		System.out.println("");
		
		System.out.println("Bucle While");
		while(c <= 10) {
			d += c;
			c++;
		}
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + d);
		
		System.out.println("");
		
		System.out.println("Bucle For");
		d = 0;
		for(c = 0; c<=10; c++) {
			d += c;
		}
		
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + d);
	}
}

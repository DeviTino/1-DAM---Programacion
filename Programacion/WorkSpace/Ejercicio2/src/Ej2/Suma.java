package Ej2;

public class Suma {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 1;
		int d = 0;
		
		
		//Para esta parte e utilizado "\n" que lo que hace es pasar la siguiente parte del texto hacia debajo
		
		System.out.println("Parte 1");
		
		System.out.println(a + "\n+\n" + b + "\n=\n" + (a + b));
		
		System.out.println("--------------------------------");
		System.out.println(a +" + " + b + "\n= " + (a + b));
		System.out.println("--------------------------------");
		System.out.println(a +" + " + b + " = (" + (a + b) + ")");
		
		System.out.println("--------------------------------");
		System.out.println("Parte 2");
		System.out.println("");
		
		System.out.println("Bucle While");
		while(c <= 10) {
			if(c < 10 ) {
				System.out.print(c + " + ");
			} else {
				System.out.print(c + " = ");
			}
			d += c;
			c++;
		}
		System.out.println(d);
		
		System.out.println("");
		
		System.out.println("Bucle For");
		d = 0;
		for(c = 0; c<=10; c++) {
			d += c;
			
			if(c < 10 && c != 0) {
				System.out.print(c + " + ");
			} else if(c != 0) {
				System.out.print(c + " = ");
			}
		}
		
		System.out.println(d);
	}
}

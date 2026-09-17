
public class Ej3 {
	public static void main(String[] args) {
		int a = 100;
		
		for(int i = 0; i <= a; i++) {
			if(i <= 30) {
				System.out.print("Pequeño: " + i);
			}
			if(i > 30 && i <= 70) {
				System.out.print("Mediano: " + i);
			}
			if(i > 70) {
				System.out.print("Grande: " + i);
			}
			if(i % 2 == 0) {
				System.out.println(" | Es par");
			}
			if(i % 5 == 0) {
				System.out.println(" | Es multiplo de 5");
			}
		}
	}
}

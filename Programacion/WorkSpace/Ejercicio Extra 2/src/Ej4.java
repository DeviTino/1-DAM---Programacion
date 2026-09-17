
public class Ej4 {
	public static void main(String[] args) {
		int cantidad = 285;
		int cincuenta = 0;
		int veint = 0;
		int diez = 0;
		int cinco = 0;
		
		while(cantidad >= 50) {
			cantidad -= 50;
			cincuenta++;
		}
		while(cantidad >= 20) {
			cantidad -= 20;
			veint++;
		}
		while(cantidad >= 10) {
			cantidad -= 10;
			diez++;
		}
		while(cantidad >= 5) {
			cantidad -= 5;
			cinco++;
		}
		
		System.out.println("50 € -> " + cincuenta);
		System.out.println("20 € -> " + veint);
		System.out.println("10 € -> " + diez);
		System.out.println("5 € -> " + cinco);
	}
}

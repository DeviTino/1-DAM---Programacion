
public class Ej4 {
	public static void main(String[] args) {
		int a = -1000;
		int contador = 0;
		
		//Primero comprobamos que el numero no sea 0 y si es un numero negativo, lo pasamos a positivo.
		if(a == 0) {
			contador = 1;
		} else {
			if (a < 0) {
				a = -a;
			}
			
			//Y ahora como ya tenemos el numero limpio, lo dividimos entre 10 hasta llegar a 0, con esto se le resta un digito por cada division y cuando llegue a 0 el contador sumara la cantidad de digitos totales.
			while (a > 0) {
				a = a / 10;
				contador++;
			}
		}
		
		System.out.println("El numero tiene " + contador + " digitos.");
	}
}


public class Ej2 {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		for(int i = (a - 1); i > 0; i--) {
			System.out.print(b + " * " + i);
			b *= i;
			System.out.println(" = " + b);
		}
	}
}

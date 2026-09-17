
public class Ej2 {
	public static void main(String[] args) {
		int a = 500;
		
		for(int i = 0; i <= 500; i++) {
			if(i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
				System.out.println(i + " cumple los requisitos");
			}
		}
	}
}

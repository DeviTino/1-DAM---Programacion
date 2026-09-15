
public class Ej2 {
	public static void main(String[] args) {
		int a = 0;
		int b = 100;
		
		for(int i = 1; i <= b; i++) {
			if(i % 2 == 0) {
				a += i;
				if (a != b) {
					System.out.print(i + " + ");
				} else {
					System.out.print("= ");
				}
			}
		}
		
		System.out.println(a);
		
		
	}
}

//sumar los primeros 5 multiplos de 3

public class extra {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		int c = 0;
		int n = 8;
		
		for(int i = 3;c < n;i++) {
			if(i % a == 0) {
				System.out.print(i);
				b += i;

				c++;
				if (c < n) {
					System.out.print(" + ");
				} else {
					System.out.print(" = ");
				}
			}
		}
		System.out.print(b);
	}
}


public class Ej5 {
	public static void main(String[] args) {
		int a = 100;
		int tres = 0;
		int cinco = 0;
		int ambos = 0;
		int primTres = 0;
		int primCinco = 0;
		boolean mTres;
		boolean mCinco;
		
		for(int i = 0; i <= a; i++) {
			mTres = false;
			mCinco = false;
			if(i % 3 == 0) {
				if (tres == 0) {
					primTres = i;
				}
				tres += i;
				mTres = true;
			}
			if(i % 5 == 0) {
				if(cinco == 0) {
					primCinco = i;
				}
				cinco += i;
				mCinco = true;
			}
			if(mTres == true && mCinco == true) {
				ambos++;
			}
		}
		
		System.out.println("Suma multiplos de 3: " + tres);
		System.out.println("Suma multiplos de 5: " + cinco);
		System.out.println("Multiplos de 3 y 5: " + (ambos - 1));
		System.out.println("Primer multiplos de ambos: " + "3 -> " + primTres + " | 5 -> " + primCinco);
	}
}

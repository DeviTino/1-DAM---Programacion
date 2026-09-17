public class Ej7 {
    public static void main(String[] args) {
        int a = 10;
        
        // Este bucle se ejecutara hasta que lleguemos al numero puesto en la variable a.
        for(int i = 2; i <= a; i++) {
            boolean esPrimo = true;
            
            //Este bucle lo que hace es que divide todos los numeros de la variable i hasta llegar al mismo numero que hay en i.
            for(int b = 2; b < i; b++) {
                if (i % b == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.print(i + ", ");
            }
        }
    }
}
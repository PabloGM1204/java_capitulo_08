package funciones.arrays;
import funciones.general.varias;
public class array {
    /**
     * Muestra el array
     * 
     * @author Pablo GM
     * 
     * @param x[] es el array que mostrara
     */
    public static void muestraArray(int x[]){
        for(int n : x){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    /**
     * A un array le da unos valores máximos y mínimos
     * 
     * @author Pablo GM
     * 
     * @param x tamaño del array
     * 
     * @param min valor mínimo
     * 
     * @param max valor maximo
     * 
     * @return el array con los números en el intervalor
     */
    public static int[] generaArrayInt(int n, int min, int max){
        int [] x = new int[n];
        for(int i = 0; i<n; i++){
            x[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return x;
    }
    /**
     * Busca el mínimo del array
     * 
     * @author Pablo GM
     * 
     * @param x[] es el array entero
     * 
     * @return devuelve el valor mas pequeño
     */
    public static int minArrayInt(int x []){
        int min = Integer.MAX_VALUE;
        for(int n : x){
            if(n<min){
                min = n;
            }
        }
        return min;
    }
    /**
     * Busca el valor máximo del array
     * 
     * @author Pablo GM
     * 
     * @param x[] es el array entero
     * 
     * @return devuelve el valor mas grande
     */
    public static int maxArrayInt(int x []){
        int max = Integer.MIN_VALUE;
        for(int n : x){
            if(n>max){
                max = n;
            }
        }
        return max;
    }
    /**
     * Hace la media de los valores
     * 
     * @author Pablo GM
     * 
     * @param x[] es el array entero
     * 
     * @return devuelve la media de valores
     */
    public static double mediaArrayInt(int x []){
        int media = 0;
        for(int n : x){
            media += n;
        }
        return (double)media/x.length;
    }
    /**
     * Te dice si un número esta en el array
     * 
     * @author Pablo GM
     * 
     * @param n es el valor que buscamos
     * 
     * @param x es el array donde buscaremos
     * 
     * @return un boolean de si esta o no
     */
    public static boolean estaEnArrayInt(int n, int x[]){
        boolean esta = true;
        for(int i : x){
            if(n == i){
                return esta;
            }
        }
        esta = false;
        return esta;
    }
    /**
     * Te dice si un número esta en el array
     * 
     * @author Pablo GM
     * 
     * @param n es el valor que buscamos
     * 
     * @param x es el array donde buscaremos
     * 
     * @return la posicion del número
     */
    public static int posicionEnArrayInt(int n, int x[]){
        int i = 0;
        for(i = 0; i<x.length; i++){
            if(x[i] == n){
                return i;
            }
        }
        return -1;
    }
    /**
     * Le da la vuelta al array
     * 
     * @author Pablo GM
     * 
     * @param x es el array
     * 
     * @return el array rotado
     */
    public static int[] arrayRotadoInt(int x[]){
        int[] a = new int[x.length];
        for(int i = 0; i<x.length; i++){
            a[x.length-i-1] = x[i];
        }
        return a;
    }
    /**
     * Rota un array a la derecha n posiciones
     * 
     * @author Pablo GM
     * 
     * @param x es el array
     * 
     * @param n son la cantidad de veces de rotar hacia la derecha
     * 
     * @return el array rotado
     */
    public static int[] arrayRotadoDerechaInt(int x[], int n){
        int[] a = x.clone(); // clona en a el contenido de x
        int i;
        int aux;
        while (n-- > 0) {
            aux = a[a.length - 1];
            for(i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = aux;
        }
    return a;
    }
    /**
     * Rota un array a la izquierda n posiciones
     * 
     * @author Pablo GM
     * 
     * @param x es el array
     * 
     * @param n son la cantidad de veces de rotar hacia la izquierda
     * 
     * @return el array rotado
     */
    public static int[] arrayRotadoIzquierdaInt(int x[], int n){
        int[] a = x.clone(); // clona en a el contenido de x
        int i;
        int aux;
        while (n-- > 0) {
            aux = a[0];
            for(i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
        a[a.length - 1] = aux;
        }
        return a;
    }
    /**
     * Del array que le pasamos buscamos los primos y se los ponemos al otro array
     * 
     * @author Pablo GM
     * 
     * @param x es el array para comprobar
     * 
     * @return en array con los primos del primero
     */
    public static int[] filtraPrimos(int x[]){
        int contPrimos = 0;
        for(int i = 0; i<x.length; i++){
            int n = x[i];
            if(varias.Primo(n)){
                contPrimos++;
            }
        }
        int[] a = new int[contPrimos];
        boolean esPrimo = true;
        int cont = 0;
        for(int i = 0; i<x.length; i++){
            for(int j = 2; j<=x[i]/2; j++){
                if(x[i]%j == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                a[cont++] = x[i];
            }
            esPrimo = true;
        }
        return a;
    }
    /**
     * Del array que le pasamos buscamos los capicuos y se los ponemos al otro array
     * 
     * @author Pablo GM
     * 
     * @param x es el array para comprobar
     * 
     * @return en array con los capicuos del primero
     */
    public static int[] filtraCapicuas(int x[]){
        boolean existe = false;
        int cont = 0;
        for(int i = 0; i<x.length; i++){
            int n = x[i];
            if(varias.Capicuo(n)){
                cont++;
                existe = true;
            }
        }
        if(!existe){
            int[] resultado = {-1};
            return resultado;
        }
        int[] resultado = new int[cont];
        cont = 0;
        for(int i = 0; i<x.length; i++){
            if(varias.Capicuo(x[i])){
                resultado[cont++] = x[i];
            }
        }
        return resultado;
    }
}

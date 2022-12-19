package funciones.arrays;
import funciones.general.*;
public class arrayBidi{
    /**
     * Muestra el array bidimensional
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array a mostrar
     */
    public static void mostrarArrayBiInt(int[][] a){
        String formato = "%"+varias.ContDigitos(maximoArrayBiInt(a))+"d";
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                System.out.printf(formato+" ",a[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Genera un array Bidimensional
     * <p>
     * @author Pablo GM
     * 
     * @param filas cuantas filas quieres
     * 
     * @param column cuantas columnas quieres
     * 
     * @param min valor mínimo del rango de números
     * 
     * @param max valor máximo del rango de números
     * 
     * @return devuelve el array completo
     */
    public static int[][] generaArrayBiInt(int filas, int column, int min, int max) {
        int[][] a = new int[filas][column];
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<column; j++){
                a[i][j] = (int)(Math.random()*(max-min+1)+min);
            }
        }
        return a;
    }
    /**
     * Te devuelve una fila del array
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @param column es la fila a sacar
     */
    public static int[] filaDeArrayBiInt(int a[][], int fila){
        int[] f = new int[a.length];
        for(int i = 0; i<f.length; i++){
            f[i] = a[fila][i];
        }
        return f;
    }
    /**
     * Te devuelve una columna del array
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @param column es la columna a sacar
     */
    public static int[] columnaDeArrayBiInt(int a[][], int column){
        int[] c = new int[a.length];
        for(int i = 0; i<c.length; i++){
            c[i] = a[i][column];
        }
        return c;
    }
    /**
     * Busca un número en el array
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @param n es el número a buscar
     * 
     * @return es un array que tiene las corrdenadas
     */
    public static int[] coordenadasEnArrayBiInt(int a[][], int n){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j] == n){
                    int[] coord ={i, j};
                    return coord;
                }
            }
        }
        int[] coord ={-1, -1};
        return coord;
    }
    /**
     * Devuelve el valor máximo de un array
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @return número máximo dentro del array
     */
    public static int maximoArrayBiInt(int a[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    /**
     * Te dice si un número es punto de silla
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @param i es la fila 
     * 
     * @param j es la columna
     * 
     * @return devuelve un boolean de si es o no
     */
    public static boolean esPuntoDeSilla(int a[][], int i, int j){
        boolean es = true;
        int[] fila = filaDeArrayBiInt(a, i);
        int[] column = columnaDeArrayBiInt(a, j);
        if((array.minArrayInt(fila) == a[i][j]) && (array.maxArrayInt(column) == a[i][j])){
            return es;
        }else{
            es = false;
            return es;
        }
    }
    /**
     * Te da la diagonal
     * <p>
     * @author Pablo GM
     * 
     * @param a es el array
     * 
     * @param fila es la fila
     * 
     * @param colum es la columna 
     * 
     * @param dir es hacia donde va la diagonal
     */
    public static int[] diagonal(int a[][], int fila, int colum, String dir){
        int elementos = 0, i, j;
        int[] diagoAux = new int[1000];
        for(i = 0; i<a.length; i++){
            for(j = 0; j<a[0].length; j++){
                if((((colum-j)==(fila-i))&&(dir.equals("nose"))) || (((colum-j)==(i-fila))&&(dir.equals("neso")))){
                    diagoAux[elementos++] = a[i][j];
                }
            }
        }
        int [] diago = new int[elementos];
        for(j = 0; j<elementos; j++){
            diago[j] = diagoAux[j];
        }
        return diago;
    }
}
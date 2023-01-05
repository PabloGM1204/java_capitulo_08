import funciones.arrays.array;
public class Ejercicio36{
    public static void main(String[] args) {
        int[] x = array.generaArrayInt(10, 0, 50);
        array.muestraArray(x);
        System.out.println("Los primos de ese array son:");
        array.muestraArray(array.filtraPrimos(x));
    }
}
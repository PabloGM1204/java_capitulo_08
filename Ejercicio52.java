import funciones.arrays.array;

public class Ejercicio52 {
    public static void main(String[] args) {
        final int[] a = {111, 222, 333, 444};
        final int[] b = {52, 37};
        array.muestraArray(a);
        System.out.println(aleatorioDeArray(a));
        array.muestraArray(b);
        System.out.println(aleatorioDeArray(b));
    }

    public static int aleatorioDeArray(int[] a) {
        return a[(int)(Math.random() * a.length)];
    }
}
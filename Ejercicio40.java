import funciones.arrays.array;;
public class Ejercicio40{
    public static void main(String[] args) {
        int[] x = array.generaArrayInt(10, 0, 100);
        array.muestraArray(x);
        array.muestraArray(array.filtraCon7(x));
    }
}
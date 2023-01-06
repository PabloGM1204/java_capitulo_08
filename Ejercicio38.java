import funciones.arrays.array;
public class Ejercicio38{
    public static void main(String[] args) {
        int[] x = array.generaArrayInt(10, 0, 200);
        array.muestraArray(x);
        array.muestraArray(array.filtraCapicuas(x));
    }
}
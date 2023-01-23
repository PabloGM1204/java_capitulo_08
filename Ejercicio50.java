import funciones.arrays.array;
import funciones.general.varias;

public class Ejercicio50 {
    public static void main(String[] args) {
        final int[] a = array.generaArrayInt(10, 2, 100);
    
        System.out.println("Array generado:");
        array.muestraArray(a);
    
        System.out.println();
    
        for (int n : a) {
            if (varias.Primo(n)) {
                System.out.print("El " + n + " es primo");
            } else {
                System.out.print("El " + n + " no es primo");
            }
            if (varias.Capicuo(n)) {
                System.out.println(" y es capicúa.");
            } else {
                System.out.println(" y no es capicúa.");
            }
        }
    }

}
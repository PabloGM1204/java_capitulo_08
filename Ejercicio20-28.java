import funciones.arrays.*;
import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te da un array con valores aleatorios");
        System.out.print("De que tamaño quieres el array: ");
        int tamaño = sc.nextInt();
        System.out.print("El mínimo del intervalo de valores del array: ");
        int min = sc.nextInt();
        System.out.print("El máximo del intervalo de valores del array: ");
        int max = sc.nextInt();
        int[] a = array.generaArrayInt(tamaño, min,max);
        array.muestraArray(a);
        System.out.println("El valor mas pequeño es: "+array.minArrayInt(a));
        System.out.println("El valor mas grande es: "+array.maxArrayInt(a));
        System.out.printf("La media de valores es: %.2f\n",array.mediaArrayInt(a));
        System.out.print("Dime un número para comprobar si esta en el array: ");
        int n = sc.nextInt();
        if(array.estaEnArrayInt(n, a)){
            System.out.println("El "+n+" esta en el array");
            System.out.println("El "+n+" esta en la posición "+array.posicionEnArrayInt(n, a)+"º");
        }else{
            System.out.println("El "+n+" no esta en el array");
        }
        System.out.println("Array volteado");
        array.muestraArray(array.arrayRotadoInt(a));
        System.out.print("Cuantas posiciones queieres rotar hacia la derecha el array: ");
        int rotadoDerecha = sc.nextInt();
        System.out.println("Array rotado a la derecha: ");
        array.muestraArray(array.arrayRotadoDerechaInt(a, rotadoDerecha));
        System.out.print("Cuantas posiciones queieres rotar hacia la izquierda el array: ");
        int rotadoIzquierda = sc.nextInt();
        System.out.println("Array rotado a la izquierda: ");
        array.muestraArray(array.arrayRotadoIzquierdaInt(a, rotadoIzquierda));
    }
}
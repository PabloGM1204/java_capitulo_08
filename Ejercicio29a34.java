import funciones.arrays.*;
import java.util.Scanner;
public class Ejercicio29a34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas filas quieres: ");
        int n = sc.nextInt();
        System.out.print("Cuantas columnas quieres: ");
        int m = sc.nextInt();
        System.out.print("El mínimo del intervalo de números: ");
        int min = sc.nextInt();
        System.out.print("El máximo del intervalo de números: ");
        int max = sc.nextInt();
        int[][] a = arrayBidi.generaArrayBiInt(n, m, min, max);
        arrayBidi.mostrarArrayBiInt(a);
        System.out.print("Que fila quieres: ");
        int fila = sc.nextInt();
        array.muestraArray(arrayBidi.filaDeArrayBiInt(a, fila));
        System.out.print("Que columna quieres: ");
        int column = sc.nextInt();
        array.muestraArray(arrayBidi.columnaDeArrayBiInt(a, column));
        System.out.print("Que número buscas: ");
        int buscar = sc.nextInt();
        array.muestraArray(arrayBidi.coordenadasEnArrayBiInt(a, buscar));
        System.out.print("Dime la fila de un número: ");
        int filaBuscar = sc.nextInt();
        System.out.print("Dime la columan de un número: ");
        int columnBuscar = sc.nextInt();
        System.out.println(a[filaBuscar][columnBuscar]);
        if(arrayBidi.esPuntoDeSilla(a, filaBuscar, columnBuscar)){
            System.out.println("Es punto de silla");
        }else{
            System.out.println("No es punto de silla");
        }
        System.out.print("Dime la fila de la diagonal: ");
        int filaDiago = sc.nextInt();
        System.out.print("Dime la columna de la diagonal: ");
        int columnDiago = sc.nextInt();
        System.out.print("Dime hacia que direccion(nose o neso): ");
        String direccion = sc.next();
        array.muestraArray(arrayBidi.diagonal(a, filaDiago, columnDiago, direccion));
    }
}
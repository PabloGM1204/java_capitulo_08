import funciones.general.*;
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te da la posición de un número dentro de otro de izquierda a derecha");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("De que número quieres saber la posición: ");
        int pos = sc.nextInt();
        System.out.println("El número que buscas esta en la posición "+varias.PosicioDigito(n, pos));
    }
}
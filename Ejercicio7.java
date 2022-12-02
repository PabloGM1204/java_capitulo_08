import funciones.general.*;
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te devuelve un digito de tu número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime que posición quieres(izquierda a derecha): ");
        int pos = sc.nextInt();
        System.out.println("El digito es "+varias.Dígito(n, pos));
    }
}
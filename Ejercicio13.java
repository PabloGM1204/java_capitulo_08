import funciones.general.*;
import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa coge un trozo de un número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime el incio: ");
        int ini = sc.nextInt();
        System.out.print("Dime el final: ");
        int fin = sc.nextInt();
        System.out.print("El intervalo del número es: "+varias.trozoDeNumero(n, ini, fin));
    }
}
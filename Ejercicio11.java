import funciones.general.*;
import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa añade dígitos a un número por detras");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Dime que número le quieres añadir: ");
        int añadir = sc.nextInt();
        System.out.println("El resultado seria: "+varias.pegaPorDetras(n, añadir));

    }
}
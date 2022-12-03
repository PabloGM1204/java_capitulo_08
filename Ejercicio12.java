import funciones.general.*;
import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pone números por delante");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Que número quieres añadir: ");
        int añadir = sc.nextInt();
        System.out.println("El resultado sería: "+varias.pegaPorDelante(n, añadir));
    }
}
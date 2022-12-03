import funciones.general.*;
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa quita dígitos a un número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Cuantos números quieres quitar(por la izquierda): ");
        int pos = sc.nextInt();
        n = varias.Volteado(n);
        System.out.println("El número quedaría en: "+varias.Volteado(varias.quitaPorDetras(n, pos)));

    }
}
import funciones.general.*;
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa voltea un número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.println("Tu número volteado es: "+varias.Volteado(n));
        
    }
}
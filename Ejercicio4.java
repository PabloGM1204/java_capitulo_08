import funciones.general.*;
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te deveulve una potencia");
        System.out.print("Dime la base: ");
        int base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int expo = sc.nextInt();
        System.out.println("La potencia de "+base+"^"+expo+" es: "+varias.Potencia(base, expo));
    }
}
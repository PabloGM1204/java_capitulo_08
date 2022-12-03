import funciones.general.*;
import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pega dos números");
        System.out.print("Dime el primer número: ");
        int n = sc.nextInt();
        System.out.print("Dime el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("El resultado sería: "+varias.juntaNumero(n, n2));
    }
}
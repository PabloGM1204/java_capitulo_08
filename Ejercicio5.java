import funciones.general.*;
import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice cuantos digitos tiene tu número");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.println("Tu número tiene "+varias.ContDigitos(n)+" digito/s");
    }
}
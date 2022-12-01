import funciones.general.*;
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te devuelve el siguiente numero primo al tuyo");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        if(n == varias.siguientePrimo(n)){
            System.out.println("Tu número es primo: "+n);
        }else{
            System.out.println("El siguiente número primo a tu número es: "+varias.siguientePrimo(n));
        }
        sc.close();
    }
}
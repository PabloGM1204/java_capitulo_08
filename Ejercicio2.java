import funciones.general.*;
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice si un número es primo o no.");
        System.out.print("Dime un número: ");
        long n = sc.nextLong();
        if(varias.Primo(n)){
            System.out.println("Tu número no es primo");
        }else{
            System.out.println("Tu número es primo");
        }
        sc.close();
    }
}
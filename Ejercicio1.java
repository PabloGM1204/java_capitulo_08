import funciones.general.*;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa comprueba si un número es capicuo o no.");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        if(varias.Capicuo(n)){
            System.out.println("Tu número es capicuo");
        }else{
            System.out.println("Tu número no es capicuo");
        }
        sc.close();
    }
}
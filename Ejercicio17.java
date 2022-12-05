import funciones.general.*;
import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pasa de binario a decimal");
        System.out.print("Dime un número binario: ");
        int n = sc.nextInt();
        int decimal = 0;
        int bits = varias.ContDigitos(n);
        for(int i = 0; i<bits; i++){
            decimal += varias.Dígito(n, bits-i-1)*varias.Potencia(2, i);
        }
        System.out.println("Tu número en decimal es: "+decimal);
    }
}
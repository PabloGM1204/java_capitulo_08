import funciones.general.*;
import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pasa de decimal a binario");
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.println("Tu número en binario es: "+decimalBinario(n));
    }
    /**
     * Convierte un número decimal a binario
     * 
     * @author Pablo GM
     * 
     * @param x es el número a convertir
     * 
     * @return te devuelve el número en binario
     */
    public static long decimalBinario(int x){
        if(x == 0){
            return 0;
        }
        long binario = 1;
        while(x>1){
            binario = varias.pegaPorDetras((int)binario, x%2);
            x = x/2;
        }
        binario = varias.pegaPorDetras((int)binario, 1);
        binario = varias.Volteado(binario);
        binario = varias.quitaPorDetras((int)binario, 1);
        return binario;
    }
}
import funciones.general.*;
public class Ejercicio15{
    public static void main(String[] args) {
        System.out.println("Este programa muetra los primos del 1 a 1000");
        for(int i = 1; i<=1000; i++){
            if(varias.Primo(i)){
                System.out.print(i+" ");
            }
        }
    }
}
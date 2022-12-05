import funciones.general.*;
public class Ejercicio16{
    public static void main(String[] args) {
        System.out.println("Este programa muestra los capicuos de 1 a 99999");
        for(int i = 1; i<=99999; i++){
            if(varias.Capicuo(i)){
                System.out.print(i+" ");
            }
        }
    }
}
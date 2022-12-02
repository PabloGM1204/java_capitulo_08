package funciones.general;

import javax.swing.text.StyledEditorKit.BoldAction;

public class varias{
    /**
     * Dice si un número es Capicuo o no
     * 
     * @author Pablo GM
     * 
     * @param x es un entero
     * 
     * @return boolean de si es capicuo o no
     */
    public static boolean Capicuo(int x){
        boolean capicuo;
        if(Volteado(x) == x){
            capicuo = true;
        }else{
            capicuo = false;
        }
        return capicuo;
    }
    /**
     * Dice si un número es primo o no
     * 
     * @author Pablo GM
     * 
     * @param x es un long
     * 
     * @return boolean de si es primo o no
     */
    public static boolean Primo(long x){
        boolean esPrimo = true;
        for(int i = 2; i<=x/2; i++){
            if(x%i == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
    /**
     * Te da el siguiente número primo a un número leido por teclado
     * 
     * @author Pablo GM
     * 
     * @param x es un entero
     * 
     * @return te devuelve el número primo siguiente a X
     */
    public static int siguientePrimo(int x){
        boolean salir = true;
        while(salir){
            if(Primo(x)){
                salir = false;
            }else{
                x++;
            }
        }
        return x;
    }
    /**
     * Calcula la pontencia de una base y un exponente dados
     * 
     * @author Pablo Gm
     * 
     * @param x un entero que corresponde a la base
     * 
     * @param y un entero que corresponde al exponente
     * 
     * @return devuelve la potencia
     */
    public static long Potencia(int x, int y){
        int aux = x;
        for(int i = 1; i<y; i++){
            x *= aux;
        }
        return x;
    }
    /**
     * Te dice cuantos digitos tiene tu número
     * 
     * @author Pablo GM
     * 
     * @param x es un entero
     * 
     * @return devuelve un entero con la cantidad de digitos que tiene el número
     */
    public static int ContDigitos(int x){
        int cont = 0;
        if(x == 0){
            cont = 1;
        }else{
            while(x>0){
                cont++;
                x/=10;
            }
        }
        return cont;
    }
    /**
     * Coge de el número con la posicion que le dice un digito
     * 
     * @author Pablo Gm
     * 
     * @param x es el número
     * 
     * @param y es la posición
     * 
     * @return el digito de la posición de tu número
     */
    public static int Dígito(int x, int y){
        x = Volteado(x);
        for(int i = 1; i<y; i++){
            x/=10;
        }
        return x%10;
    }
    /**
     * Te dice la posición de un número
     * 
     * @author Pablo GM
     * 
     * @param x
     * 
     * @param y 
     * 
     * @return devuel la posción del número
     */
    public static int PosicioDigito(int x, int y){
        x = Volteado(x);
        int cont = 1;
        while(x%10 != y){
            x /= 10;
            cont++;
        }
        return cont;
    }
    /**
     * Le da la vuelta a un número
     * 
     * @author Pablo GM
     * 
     * @param x es un entero
     * 
     * @return devuelve el entero dado la vuelta
     */
    public static int Volteado(int x){
        int nv = 0;
        while(x>0){
            nv = (nv*10)+(x%10);
            x/=10;
        }
        return nv;
    }
}
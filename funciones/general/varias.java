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
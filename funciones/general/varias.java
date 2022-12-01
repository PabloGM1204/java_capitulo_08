package funciones.general;
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
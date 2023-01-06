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
    public static double Potencia(int x, int y){
        int aux = x;
        if(y<0){
            return 0;
        }else if(y == 0){
            return 1;
        }else{
            for(int i = 1; i<y; i++){
                x *= aux;
            }
            return x;
        }
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
     * Te dice cuantos digitos tiene tu número
     * 
     * @author Pablo GM
     * 
     * @param x es un entero
     * 
     * @return devuelve un entero con la cantidad de digitos que tiene el número
     */
    public static int ContDigitos(long x){
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
     * Le das un número y las posiciones que quiere quitarle para deveolverte eso
     * 
     * @author Pablo GM
     * 
     * @param x es un entero del número
     * 
     * @param y es un entero de la cantidad de posiciones que quieres quitar
     * 
     * @return devuelve el número con las posiciones dadas
     */
    public static int quitaPorDetras(int x, int y){
        for(int i = 0; i<y; i++){
            x/=10;
        }
        return x;
    }
    /**
     * Le das un número y las posiciones que quiere quitarle para deveolverte eso
     * 
     * @author Pablo GM
     * 
     * @param x es un entero del número
     * 
     * @param y es un entero de la cantidad de posiciones que quieres quitar
     * 
     * @return devuelve el número con las posiciones dadas
     */
    public static int quitaPorDelante(int x, int y){
        x = Volteado(x);
        for(int i = 0; i<y; i++){
            x/=10;
        }
        return x;
    }
    /**
     * Añade números a un número
     * 
     * @author Pablo GM
     * 
     * @param x es el número al que añadir números
     * 
     * @param y es el número a añadir
     * 
     * @return devuelve el entero dado la vuelta
     */
    public static int pegaPorDetras(int x, int y){
        x = Volteado(x);
        int pos = ContDigitos(y);
        x = x*(int)(Math.pow(10, pos))+y;
        x = Volteado(x);
        return x;
    }
    /**
     * Añade números a un número
     * 
     * @author Pablo GM
     * 
     * @param x es el número al que añadir números
     * 
     * @param y es el número a añadir
     * 
     * @return devuelve el entero mas los números que quieres añadir
     */
    public static int pegaPorDelante(int x, int y){
        int pos = ContDigitos(y);
        x = x*(int)(Math.pow(10, pos))+y;
        return x;
    }
    /**
     * Coge el intervalo de un número
     * 
     * @author Pablo GM
     * 
     * @param x es el número inicial
     * 
     * @param y es el incio del intervalo
     * 
     * @param z es el final del intervalo
     * 
     * @return devuelve el intervalo
     */
    public static int trozoDeNumero(int x, int y, int z){
        x = Volteado(x);
        for(int i = 0; i<y; i++){
            x/=10;
        }
        x = Volteado(x);
        for(int i = 0; i<z; i++){
            x/=10;
        }
        return x;
    }
    /**
     * Pega dos números
     * 
     * @author Pablo GM
     * 
     * @param x es el primer número
     * 
     * @param y es el segundo número
     * 
     * @return devuelve los números pegados
     */
    public static int juntaNumero(int x, int y){
        int pos = ContDigitos(y);
        x = x*(int)(Math.pow(10, pos))+y;
        return x;
    }
    /**
    * Le da la vuelta a un número.
    *
    * @author Pablo GM
    *
    * @param x número al que se le quiere dar la vuelta
    *
    * @return  número volteado 
    */
    public static int Volteado(int x) {
    if (x < 0) {
        return -Volteado(-x);
    }

    int volteado = 0;

    while (x > 0) {
        volteado = (volteado * 10) + (x % 10);
        x = x / 10;
    }

    return volteado;
    }
}
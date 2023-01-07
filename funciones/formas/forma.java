package funciones.formas;
public class forma {
    /**
     * Pinta una piramide rellena
     * 
     * @author Pablo GM
     * 
     * @param alt la altura de la piramide
     */
    public static void triangulo(int alt){
        for(int i = 0; i<alt; i++){
            for(int j = alt-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

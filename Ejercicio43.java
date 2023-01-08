import java.util.Scanner;
public class Ejercicio43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int alt = sc.nextInt();
        System.out.println(linea('*', alt));
        for(int i = alt-1; i>0; i--){
            System.out.print(linea(' ', alt-i));
            System.out.println(linea('*', i));
        }
    }
    public static String linea(char caracter, int rep){
        String resultado = "";

        for(int i = 0; i<rep; i++){
            resultado += caracter;
        }

        return resultado;
    }
}
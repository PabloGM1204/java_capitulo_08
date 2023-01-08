import java.util.Scanner;
import funciones.formas.forma;
public class Ejercicio42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de tu piramide: ");
        int alt = sc.nextInt();
        forma.trianguloVacio(alt);
    }
}
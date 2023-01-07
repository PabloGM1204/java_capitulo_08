import java.util.Scanner;
import funciones.formas.forma;
public class Ejercicio41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int alt = sc.nextInt();
        forma.triangulo(alt);
    }
}
import java.util.Scanner;
import funciones.general.varias;
public class Ejercicio37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número para convertir en morse: ");
        int n = sc.nextInt();
        System.out.println("Tu número en morse es: "+convierteEnMorse(n));
    }

    public static String convierteEnMorse(int n){
        String resultado = "";
        int nv = varias.Volteado(n);
        do {
            int x = nv%10;
            switch (x) {
                case 1:
                    resultado += ". - - - -";
                    break;
                case 2:
                    resultado += ". . - - -";
                    break;
                case 3:
                    resultado += ". . . - -";
                    break;
                case 4:
                    resultado += ". . . . -";
                    break;
                case 5:
                    resultado += ". . . . .";
                    break;
                case 6:
                    resultado += "- . . . .";
                    break;
                case 7:
                    resultado += "- - . . .";
                    break;
                case 8:
                    resultado += "- - - . .";
                    break;
                case 9:
                    resultado += "- - - - .";
                    break;
                case 0:
                    resultado += "- - - - -";
                    break;
                default:
                break;
            }
            nv /= 10;
        } while (nv != 0);
        return resultado;
    }
}
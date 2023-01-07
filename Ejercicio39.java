import funciones.general.varias;
import java.util.Scanner;
public class Ejercicio39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int n = sc.nextInt();
        System.out.print("Tu número quedaría en: "+convierteEnPalabras(n));
    }
    public static String convierteEnPalabras(int n){
        String resultado = "";
        int nv = varias.Volteado(n);
        do{
            int x = nv%10;
            switch (x) {
                case 0:
                resultado += "cero";
                    break;
                case 1:
                resultado += "uno";
                    break;
                case 2:
                resultado += "dos";
                    break;
                case 3:
                resultado += "tres";
                    break;
                case 4:
                resultado += "cuatro";
                    break;
                case 5:
                resultado += "cinco";
                    break;
                case 6:
                resultado += "seis";
                    break;
                case 7:
                resultado += "siete";
                    break;
                case 8:
                resultado += "ocho";
                    break;
                case 9:
                resultado += "nueve";
                    break;
                default:
                    break;
            }
            if(nv/10 != 0){
                resultado += ", ";
            }
            nv /= 10;
        }while(nv != 0);
        return resultado;
    }

}
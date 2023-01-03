import java.util.Scanner;
public class Ejercicio35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número para pasar al sistema de palotes: ");
        int n = sc.nextInt();
        System.out.println("Tu número en el sistema de palotes es: "+Palotes(n));

    }

    public static String Palotes(int n){
        int nv = 0;
        int nc = n;
        do{
            nv = (nv*10)+(n%10);
            n /= 10;
        }while(n != 0);
        String resultado = "";
        do{
            for(int i = 0; i<(nv%10); i++){
                resultado += "| ";   
            }
            if(nv != nc%10){
                resultado += "- ";
            }
            nv /= 10;
        }while(nv != 0);
        return resultado;
    }
}
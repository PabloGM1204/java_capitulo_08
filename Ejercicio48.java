import funciones.arrays.array;

public class Ejercicio48 {
    public static void main(String[] args) {
      final int[] a = {8, 9, 0};
      final int[] b = {1, 2, 3};
      System.out.print("a: ");
      array.muestraArray(a);
      System.out.print("b: ");
      array.muestraArray(b);
      System.out.print("concatena(a, b): ");
      array.muestraArray(concatena(a, b));
  }
  public static int[] concatena(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
      resultado[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      resultado[i + a.length] = b[i];
    }

    return resultado;
  }
  
}
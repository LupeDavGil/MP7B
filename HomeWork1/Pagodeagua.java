import java.util.Scanner;
public class Pagodeagua{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double A, L, N, CM, V, PAG;
    System.out.println("Calcular el volumen");
    System.out.println("Ingresa el largo de la alberca");
    L = ingreso.nextInt();
    System.out.println("Ingresa el ancho de la alberca");
    N = ingreso.nextInt();
    System.out.println("Ingresa el altura de la alberca");
    A = ingreso.nextInt();
    V = L * N * A;
    System.out.println("El volumen es " + V);

    System.out.println("Introduce el costo por metro cubico");
    CM = ingreso.nextInt();

    PAG = V * CM;
    System.out.println("Pago a realizar es de :" + PAG);
  }
}

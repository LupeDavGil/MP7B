import java.util.Scanner;
public class Prendas{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double CM, PG;
    System.out.println("Introdusca los metros de tela :");
    CM = ingreso.nextInt();

    PG = CM / 0.0254;
    System.out.println("Pulgadas de tela a solicitar" + PG);
  }
}

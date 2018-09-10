import java.util.Scanner;
public class registrodegalonesaldia{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int L;
    double PG, TG, GA;
    System.out.println("Introdusca el numero de litros de leche vendidos:");
    L = ingreso.nextInt();

    TG = (L / 3.785);
    System.out.println("Galones que produce" + TG);

    System.out.println("Introduce el precio por galon");
    PG = ingreso.nextInt();

    GA = TG * PG;
    System.out.println("Ganancia total del dia es:" + GA);
  }
}

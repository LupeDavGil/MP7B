import java.util.Scanner;
public class registrodegalonesaldia{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int PG, TG, GA,L;
    System.out.println("Introdusca el numero de litros de leche vendidos:");
    TG = (L / 3.785);
    GA = ( PG * TG );
    System.out.println("Ganancia total del dia es:" + GA);
  }
}

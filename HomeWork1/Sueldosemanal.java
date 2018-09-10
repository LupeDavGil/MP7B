import java.util.Scanner;
public class Sueldosemanal{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double HT, PH, SS;
    System.out.println("Introdusca el numero de horas trabajadas:");
    HT = ingreso.nextInt();

    System.out.println("Introduce el pago por hora");
    PH = ingreso.nextInt();

    SS = HT * PH;
    System.out.println("El sueldo semanal es de :" + SS);
  }
}

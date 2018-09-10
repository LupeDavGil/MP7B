import java.util.Scanner;
public class areadeunaCircunferencia{
   public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int radio;
    double radio2, area;
    double pi = 3.14;
    System.out.println("Ingresa el radio:");
    radio = ingreso.nextInt();
    radio2 = Math.pow(radio,2);
    area = radio2 * pi;
    System.out.println("El area es" + area);
  }
}

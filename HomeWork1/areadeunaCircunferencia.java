import java.util.Scanner;
public class areadeunaCircunferencia{
   public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double radio, area;
    double pi = 3.14;
    System.out.println("Ingresa el radio:");
    radio = ingreso.nextInt();
    area = (radio*radio) * pi;
    System.out.println("El area es" + area);
  }
}

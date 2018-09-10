import java.util.Scanner;
public class areadeunrectangulo{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int base, altura, area;
    System.out.println("area de un rectangulo");
    System.out.println("ingrese la base");
    base = ingreso.nextInt();
    System.out.println("ingresa la altura");
    altura = ingreso.nextInt();
    area = base * altura ;
    System.out.println("El area es " + area );
  }
}

import java.util.Scanner;
public class areadelterreno{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int base1, altura1, areat, base2, altura2, arear, areatotal;
    System.out.println("area del triangulo");
    System.out.println("ingresa la base");
    base1= ingreso.nextInt();
    System.out.println("ingresa la altura");
    altura1= ingreso.nextInt();
    areat = (base1 * altura1) /2 ;
    System.out.println("el area del triangulo es" + areat);

    System.out.println("area del rectangulo");
    System.out.println("ingresa la base");
    base2= ingreso.nextInt();
    System.out.println("ingresa la altura");
    altura2= ingreso.nextInt();
    arear = base2 * altura2 ;
    System.out.println("el area del rectangulo es" + arear);

    System.out.println("area del terreno");
    areatotal = areat + arear ;
    System.out.println("el area del terreno es" + areatotal);
  }
}

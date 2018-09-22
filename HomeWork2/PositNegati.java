import java.util.Scanner;
public class PositNegati{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int Numero1;
    System.out.println("Ingresa el primer número");
    Numero1 = ingreso.nextInt();
    if (Numero1>0){
      System.out.println("El número es positivo");
    }else{
      System.out.println("El número es negativo");
    }
  }
}

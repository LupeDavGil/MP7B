import java.util.Scanner;
public class ValordeNumeros{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int Numero1, Numero2;
    System.out.println("Ingresa un numero:");
    Numero1 = ingreso.nextInt();
    System.out.println("Ingresa un numero:");
    Numero2 = ingreso.nextInt();

    if (num1>num2){
      System.out.println("El numero mayor es: " + Numero1);
    }else{
      System.out.println("El numero mayor es: " + Numero2);
    }

  }
 }

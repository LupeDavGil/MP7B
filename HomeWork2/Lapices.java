import java.util.Scanner;
public class Lapices{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int x,Pag;
    System.out.println("Cantidad de Lapices: ");
    x = ingreso.nextInt();
    if (x>1000){
      Pag = (x * 85);
      System.out.println("Cantidad de Lapices a pagar es : " + Pag);
      }else{
        Pag = (x * 90);
      System.out.println("Cantidad de Lapices a pagar es : " + Pag);
    }
  }
}

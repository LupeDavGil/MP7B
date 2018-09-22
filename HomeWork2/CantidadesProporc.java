import java.util.Scanner;
public class CantidadesProporc{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Ct1, Ct2, Ct3, M ;
    System.out.println("ingresa el primer valor : ");
    Ct1 = input.nextInt();
    System.out.println("ingresa el segundo valor : ");
    Ct2 = input.nextInt();
    System.out.println("ingresa el tercer valor : ");
    Ct3 = input.nextInt();
    if (Ct1>Ct2 && Ct1>Ct3){
    System.out.println("valor mayor es : " + Ct1);
  }else if ( Ct2>Ct1 && Ct2>Ct3){
    System.out.println("valor mayor es : " + Ct2);
  }else{
    System.out.println("valor mayor es : " + Ct3);
  }
 }
}

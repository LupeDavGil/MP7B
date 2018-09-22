import java.util.Scanner;
public class CantidadesProporc{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Ct1A, Ct2B, Ct3C, M ;
    System.out.println("ingresa el primer valor : ");
    Ct1A = input.nextInt();
    System.out.println("ingresa el segundo valor : ");
    Ct2B = input.nextInt();
    System.out.println("ingresa el tercer valor : ");
    Ct3C = input.nextInt();
    if (Ct1A>Ct2B && Ct1A>Ct3C){
    System.out.println("valor mayor es : " + Ct1A);
  }else if ( Ct2B>Ct1A && Ct2B>Ct3C){
    System.out.println("valor mayor es : " + Ct2B);
  }else{
    System.out.println("valor mayor es : " + Ct3C);
  }
 }
}

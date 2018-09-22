import java.util.Scanner;
public class Langosta{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int NP,TOT;

System.out.println("Ingresa el cantidad de personas : ");
NP = input.nextInt();
if (NP>300){
  TOT = NP * 75;
  System.out.println("Total a pagar de la langosta : " + TOT);
}else if (NP>200 && NP <=300){
  TOT = NP * 85;
  System.out.println("Total a pagar de la langosta : " + TOT);
}else{
  TOT = NP * 95;
  System.out.println(" es menor que :" + TOT);
  }
 }
}

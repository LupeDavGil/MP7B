import java.util.Scanner;
public class Trajes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double PF, DE ;
    System.out.println("Ingresar el precio del Traje : ");
    Double CT =input.nextDouble();

    if (CT >=2500){
      DE = (CT * 15) / 100;
      PF = CT - DE;
      System.out.println("Precio final del Traje es : "+ PF);
    }else{
      DE = (CT * 8) / 100;
      PF = CT - DE;
      System.out.println("Precio final del Traje es : " + PF);
     }
   }
}

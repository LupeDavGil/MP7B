import java.util.Scanner;
public class EjercicioBanco{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in );

    System.out.println("Ingrese el tipo de tarjera :");
    double TT=input.nextDouble();

    System.out.println(" limite de credito actual ");
    double LA=input.nextDouble();

  if (TT == 1 ){
  double AC=LA*.25;
  double NC=  LA + AC;
  System.out.println("SU NUEVO LIMITE DE CREDITO ES : " + NC);
}
  else if (TT == 2){
  double AC=LA*.35;
  double NC=  LA + AC;
  System.out.println("SU NUEVO LIMITE DE CREDITO ES : " + NC);
}
  if (TT == 3){
  double AC=LA*.40;
  double NC= LA + AC;
  System.out.println("SU NUEVO LIMITE DE CREDITO ES : " + NC);
}
   if (TT > 3){
  double AC=LA*.50;
  double NC=  LA + AC;
  System.out.println("SU NUEVO LIMITE DE CREDITO ES : " + NC);
}

  }
}

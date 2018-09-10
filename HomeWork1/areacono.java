import java.util.Scanner;
public class areacono{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double radio, area1, areasemi, cateto1, cateto2, a, b, hipotenusa, area2, areafigura ;
    double pi = 3.1416;
    System.out.println("Area de la semicircunferencia");
    System.out.println("Ingresa el radio:");
    radio = ingreso.nextInt();
    area1 = (radio*radio) * pi;
    areasemi = area1/2;
    System.out.println("El area es" + areasemi);

    System.out.println("Ingresa el cateto faltante para calcular hipotenusa");
    cateto1= radio;
    System.out.println("ingresa el cateto2");
    cateto2= ingreso.nextInt();
    a = Math.sqrt(cateto1);
    b = Math.sqrt(cateto2);
    hipotenusa = a + b;
    System.out.println("la hipotenusa es" + hipotenusa);

    System.out.println("Area del triangulo");
    area2 = ((cateto1*2) * cateto2) /2;
    System.out.println("el area del triangulo es" + area2);
    System.out.println("calcula el area de la figura");
    areafigura = areasemi + area2;
    System.out.println("Area de la Figura es " + areafigura);

  }
}

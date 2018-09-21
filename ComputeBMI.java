import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //palabra para las constantes  con un palabra reservada
        final double KILOGRAMS_PER_POUND = 0.4535923;
        final double  METERS_PER_INCH=0.254;

    System.out.println("Enter weight in pounds:");
    double weight=input.nextDouble();

    System.out.println("Enter weight in inches:");
    double height=input.nextDouble();

double weightInKilogams= weight*  KILOGRAMS_PER_POUND;
double heightInMeters=height * METERS_PER_INCH;

double bmi=weightInKilogams/(heightInMeters*heightInMeters);
//double bmi =weightInKilogams/Math.pow (heightInMeters,2 )
System.out.println( "your BMI is " + bmi );

if (bmi < 16 )
System.out.println("your are seiuosly underweight");
else if (bmi < 18)
System.out.println("your are underweight ");
else if (bmi < 24 )
System.out.println("your are normal weight");
else if (bmi <29 )
System.out.println("your are overweight ");
else if (bmi <35 )
System.out.println("your are seriously overweight");
else
System.out.println("your are gravely overweight");

  }
}

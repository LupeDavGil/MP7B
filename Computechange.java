import java.util.Scanner;
Public class Computechange{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an amount in double:");
    double amount = input.nextDouble();
    int cents = (int)(amount)*100;
     int numberOfDollars = cents / 100;
     cents = cents % 100;
     int numberOfQuarter = cents / 25;
     cents = cents % 25;
     int numberOfDimes = cents / 10;
     cents = cents % 10;
     int numberOfNickels = cents / 5;
     cents = cents % 5;
     int numberOfPennies = cents ;

    System.out.println( "Your amount" + amount + "consist of \n"+¨\t¨); +numberOfDollars+¨dollars¨+
    ¨\+¨ + numberOfQuarter + ¨quarters¨ +
    ¨\+¨ + numberOfDimes + ¨dimes¨ +
    ¨\+¨ + numberOfNickels + ¨nickels¨ +
    ¨\+¨ + numberOfPennies + ¨Quarters¨ +;
  }
}

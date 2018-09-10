import java.util.Scanner;
public class GuessBirthday{
  public static void main(String[] args) {
    String set1 = "1 2 5 7 \n" +
                  "9 11 13 15 \n" +
                  "17 19 21 23 \n" +
                  "25 27 29 31";

    String set2 = "2 3 6 7 \n"+
                  "10 11 14 15\n"+
                  "18 19 22 23\n"+
                  "26 27 30 31";

    String set3 = "4 5 6 7\n"+
                  "12 13 14 15\n"+
                  "20 21 22 23\n"+
                  "28 29 30 31";

    String set4 = "8 9 10 11\n"+
                  "12 13 14 15\n"+
                  "24 25 26 27\n"+
                  "28 29 30 31";

    String set5 = "16 17 18 19\n"+
                  "20 21 22 23\n"+
                  "24 25 26 27\n"+
                  "28 29 30 31";


  Scanner input = new Scanner (System.int);
  int day = 0;

  system.out.println("is your birthday in Set1\n");
  System.out.println(Set1);
  System.out.println("\nEnter 0 for NO and 1 for YES: ");
  int answer = input.nextInt();

  if (answer == 1){
    day = day +1; //acumulador

    day+=1 //cumulador resumido
  }

  system.out.println("is your birthday in Set2\n");
  System.out.println(Set2);
  System.out.println("\nEnter 0 for NO and 1 for YES: ");
  answer = input.nextInt();

  if (answer ==1){
    day +=2;
  }
  system.out.println("is your birthday in Set3\n");
  System.out.println(Set3);
  System.out.println("\nEnter 0 for NO and 1 for YES: ");
  answer = input.nextInt();

  if (answer ==1){
    day +=4;
  }
  system.out.println("is your birthday in Set4\n");
  System.out.println(Set4);
  System.out.println("\nEnter 0 for NO and 1 for YES: ");
  answer = input.nextInt();

  if (answer ==1){
    day +=8;
  }
  system.out.println("is your birthday in Set5\n");
  System.out.println(Set5);
  System.out.println("\nEnter 0 for NO and 1 for YES: ");
  answer = input.nextInt();

  if (answer ==1){
    day +=16;
}

System.out.println("\n Your birthday is"+ day);
{

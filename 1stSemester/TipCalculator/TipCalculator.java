import java.util.Scanner;

public class TipCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int satisfactionLevel = 1;
    double price = 0;
    double total = 0;
    double tipAmount = 0;


    System.out.println("How much is your meal?");
    price = input.nextInt();


    System.out.println("How Statisfied are you with the service?\n(1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied)");
    satisfactionLevel = input.nextInt();


    if (satisfactionLevel == 1) {
      tipAmount = price * .20;
    } else if(satisfactionLevel == 2) {
      tipAmount = price * .15;
    } else if(satisfactionLevel == 3) {
      tipAmount = price * .10;
    }

    total = price + tipAmount;

    System.out.println("Price of meal: " + price);
    System.out.println("Satisfaction level: " + satisfactionLevel);
    System.out.println("Tip: " + tipAmount);
    System.out.println("Total: " + total);


  }
}

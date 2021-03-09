import java.util.Scanner;
public class TankerApp {
  //MainMethod
  public static void main(String[] args) {
    System.out.println("Welcome to the Tanker app...");
    Scanner input = new Scanner(System.in);

    Boolean validAvg = false;
    Boolean validAge = false;
    int estLongevity = 0;
    float avgDailyConsumption = 0;

    while(!validAvg) {
      System.out.println("Enter a postive number of fluid ounces in a day:");
      avgDailyConsumption = input.nextFloat();
      if(avgDailyConsumption > 0) {
        validAvg = true;
      }
    }

    while(!validAge) {
      System.out.println("Enter your estimated lifespan in years:");
      estLongevity = input.nextInt();
      if(estLongevity > 0) {
        validAge = true;
      }
    }

    input.close();

    float lifetimeFluid = avgDailyConsumption * estLongevity * 365;
    float tankturcks = lifetimeFluid / (128 * 11000);

    System.out.println("The estimated number of tanks you will consume is " + tankturcks);

  }
}

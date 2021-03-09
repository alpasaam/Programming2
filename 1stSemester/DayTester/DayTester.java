import java.util.Scanner;

public class DayTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String bd = "0000";
    Day today = new Day();

    System.out.println("What is your birthday? (YYYY MM DD)");
    bd = input.nextLine();

    input.close();

    String [] bdParts = bd.split(" ");
    int y = Integer.parseInt(bdParts[0]);
    int m = Integer.parseInt(bdParts[1]);
    int d = Integer.parseInt(bdParts[2]);

    Day birthday = new Day(y, m, d);
    int daysAlive = today.daysFrom(birthday);

    System.out.println("You have been alive for " + daysAlive + " days.");

  }
}

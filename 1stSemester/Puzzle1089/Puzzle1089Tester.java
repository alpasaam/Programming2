import java.util.Scanner;

public class Puzzle1089Tester {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number of your choice (at least 3 digits): ");
    int input = in.nextInt();
    Puzzle1089 p1 = new Puzzle1089(input);


    System.out.println("After taking the last three digits of your number and reversing the number: " + p1.firstReversed());


    System.out.println("Their differences: " + p1.difference());


    System.out.println("Reverse it again: " + p1.secondReverse());

    System.out.println("The sum of the last two number is: " + p1.sum());






  }
}

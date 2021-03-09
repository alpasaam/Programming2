import java.util.Scanner;

public class MicrowaveTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Microwave m1 = new Microwave();

    System.out.println("Increasing time by 50 seconds");
    m1.increaseTime(50);
    System.out.println(m1.start());

    System.out.println("Changing level to level 2");
    m1.level(2);
    System.out.println(m1.start());

    System.out.println("After resetting: ");
    m1.reset();
    System.out.println(m1.start());



  }
}

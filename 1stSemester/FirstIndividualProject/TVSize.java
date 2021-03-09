import java.util.Scanner;
public class Main {
  //MainMethod
  public static void main(String[] args) {
    System.out.println("Welcome to my app to help you find out the size of your TV");
    Scanner input = new Scanner(System.in);

    Boolean validD = false;
    Boolean validA = false;
    Boolean validB = false;
    float d = 0;
    float a = 0;
    float b = 0;

    while(!validD) {
      System.out.println("Enter a postive number of the diagonal measurment of your TV:");
      d = input.nextFloat();
      if(d > 0) {
        validD = true;
      }
    }

    while(!validA) {
      System.out.println("Enter your TV's aspect ratio(A:B)(only enter A):");
      a = input.nextFloat();
      if(a > 0) {
        validA = true;
      }
    }

    while(!validB) {
      System.out.println("Enter your TV's aspect ratio(A:B)(only enter B):");
      b = input.nextFloat();
      if(b > 0) {
        validB = true;
      }
    }

    input.close();

    double ld = (a * d) / (Math.sqrt(a*a + b*b));
    double wd = (b * d) / (Math.sqrt(a*a + b*b));

    int l = (int)ld;
    int w = (int)wd;

    System.out.println("The length of your TV is " + l );
    System.out.println("The width of your TV is " + w );
  }
}

import java.math.*;
import java.util.Scanner;

public class BigInt {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      BigInteger bi1, bi2, bi3, bi4, bi5;
      int exponent;

      System.out.println("Type in a Big number: ");
      bi1 = new BigInteger(input.next());

      //the square of bi1
      exponent = 2;
      bi2 = bi1.pow(exponent);
      System.out.println( "Result of " + bi1 + "^" +exponent+ " = " + bi2);

      //fourth power of bi1
      exponent = 4;
      bi3 = bi1.pow(exponent);
      System.out.println( "Result of " + bi1 + "^" +exponent+ " = " + bi3);

      //eighth power of bi1
      exponent = 8;
      bi4 = bi1.pow(exponent);
      System.out.println( "Result of " + bi1 + "^" +exponent+ " = " + bi4);

      System.out.println("Now that you've seen the power of the class BigInteger...");
      System.out.println("What would you like " + bi1 + " to be raised to? ");
      exponent = input.nextInt();
      bi5 = bi1.pow(exponent);
      System.out.println( "Result of " + bi1 + "^" +exponent+ " = " + bi5);

      input.close();




   }
}

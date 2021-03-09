import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double num1, num2,result;
    Scanner s1 = new Scanner(System.in);

    System.out.println("Welcome to the Calculator");

    System.out.println("Please enter first number");
    num1 = s1.nextDouble();

    System.out.println("Please enter second number");
    num2 = s1.nextDouble();

    System.out.println("Please enter an operator");
    char operator = s1.next().charAt(0);


    switch(operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        result = num1 / num2;
        break;

      default:
        System.out.println("You have enterned wrong operator");
        return;
    }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    System.out.println("would you like to preform another calculation? (Y/N)");
    char answer = s1.next().charAt(0);

    switch(answer) {
      case 'Y':
        Main.main(args);

      case 'N':
        System.exit(0);
    }
  }

}

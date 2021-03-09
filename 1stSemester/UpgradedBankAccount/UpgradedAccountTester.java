import java.util.Scanner;

public class UpgradedAccountTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		UpgradedBankAccount ac1 = new UpgradedBankAccount(100);
		double userAmount = 0;


		System.out.println("you have " + ac1.getBalance() + " in your account.");


		System.out.println("How much would you like to deposit?");
		userAmount = input.nextDouble();
		ac1.deposit(userAmount);
		System.out.println("Your new balance is " + ac1.getBalance() + " dollars.");


		System.out.println("How much would you like to withdrawal?");
		userAmount = input.nextDouble();
		ac1.withdrawal(userAmount);
		System.out.println("Your new balance is " + ac1.getBalance() + " dollars.");


		System.out.println("There will be a monthly charge for this. of 10 cents.");
		ac1.deductMonthlyCharge();
		System.out.println("Your new balance is " + ac1.getBalance() + " dollars.");


	}
}

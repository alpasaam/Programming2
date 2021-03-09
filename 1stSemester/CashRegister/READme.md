•• E4.20Enhance the CashRegister class by adding separate methods enterDollars, enterQuarters, enterDimes, enterNickels, and enterPennies.

Use this tester class:

public class CashRegisterTester
{
   public static void main (String[] args)
   {
      CashRegister register = new CashRegister();
      register.recordPurchase(20.37);
      register.enterDollars(20);
      register.enterQuarters(2);
      System.out.println("Change: " + register.giveChange());
      System.out.println("Expected: 0.13");
   }
}

public class UpgradedBankAccount {
	private double balance;
	private double amount;
	private double transactionFee;
	private double fee = .10;


/**
*
*
*
*/

	// Constructor
	public UpgradedBankAccount() {
		this.balance = 0;
	}


	// Constructor with parameters
	public UpgradedBankAccount (double initialValue) {
		this.balance = initialValue;
	}


	// Member methods

	/**
	* This method is used to deposit mooney into the account by adding the amount to the balance
	* @param amount is the amount of money you're putting into the account
	*/
	public void deposit(double amount) {
		this.balance = balance + amount;
	}


	/**
	* This method will withdraw money from the account
	* @param amount is the amount you are withdrawing from the account
	*/
	public void withdrawal(double amount) {
		this.balance = balance - amount;

	}


	/**
	* This method will return a number with the balance of the account
	* @return balance is the amount in the account right now
	*/
	public double getBalance() {
		return balance;

	}


	/**
	* this account is used to store how much the fee is for the monthly charge
	* @param fee is something that I have no idea what it does
	*/
	public void setTransactionFee(double fee) {
		this.transactionFee = fee;
	}


	/**
	* This method deducts the monthly fee from the account
	*/
	public void deductMonthlyCharge() {
		this.balance = balance - fee;
	}
}

// Kaleila's number = 63942348
// Bryan's number = 63949115
// Quinn's number = 63944058

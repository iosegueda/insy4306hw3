//Iris Osegueda
import java.io.*;
import java.util.util*;

public class Transaction implements Runnable
{
	private String threadName;
	private Account account;
	
	public Transaction(String s, Account a)
	{
		threadName = s;
		account = a;
	}
	public void run()
	{
		//not sure what goes in here
		//is this where we call the deposit and withdraw functions?

		// you need to have a way to tell this class what type of function to use
		// maybe a boolean in the constructor to say deposit or withdraw
		// call the appropriate function from the "account" (account.deposit() or account.withdraw()) based on the bool
		// you will also need a variable for the amount to deposit or withdraw, probably a double

		// so now when the executorService.execute() is called in TransactionTest it will do this function
		// which will withdraw or deposit from the account
	}
}
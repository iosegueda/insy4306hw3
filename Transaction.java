//Iris Osegueda
import java.io.*;
import java.util.*;

public class Transaction implements Runnable
{
	private Account account;
	private double amount; 
	private boolean deposit;
		
	public Transaction(Account a, double amt, boolean dep)
	{
		account = a;
		amount = amt;
		deposit = dep;
	}
	public void run()
	{
		if(deposit)
		{
			account.deposit(amount);
		}
		else
		{
			account.withdraw(amount);
		}
	}
}
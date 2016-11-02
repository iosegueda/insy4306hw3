//Iris Osegueda
import java.io.*;
import java.util.*;

public class Transaction implements Runnable
{
	private Account account;
	private String name;
		
	public Transaction(Account a, String n)
	{
		account = a;
		name = n;
	}
	public void run()
	{
		account.deposit(25.00, name);
		account.withdraw(50.00, name);
		account.withdraw(50.00, name);
	}
}
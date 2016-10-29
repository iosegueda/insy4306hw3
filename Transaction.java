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
	}
}
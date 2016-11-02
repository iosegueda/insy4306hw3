//Iris Osegueda
public class Account
{
	private double amountAvailable;
	
	public Account()
	{
		setAmountAvailable(100.00);

	}
	public Account(double a)
	{
		setAmountAvailable(a);
	}
	public synchronized void setAmountAvailable(double a)
	{
		amountAvailable = a;
	}
	public synchronized double getAmountAvailable()
	{

		return amountAvailable;
	}
	public String toString()
	{
		String stringFormat = "Amount Available: $" +String.format("%.2f", amountAvailable);
		return stringFormat;
	}
	public void printBalance()
	{
		System.out.println(toString());

	}
	public synchronized void deposit(double depositAmount, String threadName)
	{
		double amount = getAmountAvailable();
		
		amount += depositAmount;
		
		setAmountAvailable(amount);
		System.out.println("[" + threadName +"] " + "Deposit transaction successfully completed.");
	}
	public synchronized void withdraw(double withdrawAmount, String threadName)
	{
		double amount = getAmountAvailable();
		
		if(amount >= withdrawAmount)
		{
			amount -= withdrawAmount;
			setAmountAvailable(amount);
			System.out.println("[" + threadName +"] " + "Withdraw transaction successfully completed.");
		}
		else
		{
			System.out.println("[" + threadName +"] " + "Insufficient funds, transaction could not be completed.");
		}
	}
}
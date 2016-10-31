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
	public void setAmountAvailable(double a)
	{
		amountAvailable = a;
	}
	public double getAmountAvailable()
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
	public synchronized void deposit(double depositAmount)
	{
		double amount = getAmountAvailable();
		
		amount += depositAmount;
		
		setAmountAvailable(amount);
		System.out.println("Deposit transaction completed.");
	}
	public synchronized void withdraw(double withdrawAmount)
	{
		double amount = getAmountAvailable();
		
		if(amount > withdrawAmount)
		{
			amount -= withdrawAmount;
			setAmountAvailable(amount);
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		System.out.println("Withdraw transaction completed.");
	}
}
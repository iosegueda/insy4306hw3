//Iris Osegueda
public class Account
{
	private double amountAvailable;
	
	
	public Account()
	{
		setAmountAvailable(100.00)
		//what all makes up an account?
		//should I have an accountID but then i'd have to do more work to set something up 
		//give it an automatic number wouldn't i? I guess I could do a loop?
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
		return ("%.2f\n", amountAvailable);
	}
	public String toString()
	{
		return (" Amount Available: $" + amountAvailable);
	}
	
	public void synchronized deposit(double depositAmount)
	{
		//should this extend Thread?
		double amount = getAmountAvailable();
		
		amount += depositAmount;
		
		setAmountAvailable(amount);
	}
	public synchronized printBalance()
	{
		return toString();
		//should this extend Thread?
	}
	public synchronized withdraw(double withdrawAmount)
	{
		//should this extend Thread?
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
		
		
	}
}
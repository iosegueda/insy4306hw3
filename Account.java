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

		// i think it is fine the way it is now, what would an account id help with
		// in the context of this assignment?
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
		// you shouldnt have the rounding here, you should have the rounding where it's set
		// that way, when it is used somewhere else it is already rounded and you don't have
		// to round every time you use amoutAvailable
		return ("%.2f\n", amountAvailable);
	}
	public String toString()
	{
		return (" Amount Available: $" + amountAvailable);
	}
	// this returns a string, should be a String function
	public synchronized printBalance()
	{
		return toString();
		//should this extend Thread?

		// i think it is fine as is, classes extend, not functions
	}
	public void synchronized deposit(double depositAmount)
	{
		//should this extend Thread?

		// i think it is fine as is, classes extend, not functions

		double amount = getAmountAvailable();
		
		// you should round depositAmount so that it doesn't add extra decimals to the end
		amount += depositAmount;
		
		setAmountAvailable(amount);
	}
	public synchronized withdraw(double withdrawAmount)
	{
		//should this extend Thread?

		// i think it is fine as is, classes extend, not functions
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
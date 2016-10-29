//Iris Osegueda
//no idea if this is set up right or what entirely is going on or supposed to happen here
//i know that we're starting threads but how do we define what transaction we're calling? 
//or is this where i call the withdraw and deposit threads?
import java.util.*; 

public class TransactionTest
{
	public static void main(String args[]) throws InterruptedException
	{
		boolean taskEnded;
		
		Account account = new Account();
		
		Transaction t1 = new Transaction(/* not sure what goes in here */); /* look at transaction constructor (string s, account a) probably needs bool deposit and double amt */
		Transaction t2 = new Transaction(/* not sure what goes in here */);
		Transaction t3 = new Transaction(/* not sure what goes in here */);
		
		ExecutorService executorService = Executors.newCachedThreadedPool();
		
		executorService.execute(t1); 
		executorService.execute(t2);
		executorService.execute(t2); 
		
		executorService.shutdown();
		
		taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		if(tasksEnded)
			System.out.println("Processing count = " + ProcessingThread.getcount());
	}
}
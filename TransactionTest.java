//Iris Osegueda
import java.util.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TransactionTest
{
	public static void main(String args[]) throws InterruptedException
	{		
		boolean taskEnded;
		Account account = new Account();
		
		Transaction t1 = new Transaction(account, "Thread 1"); 
		Transaction t2 = new Transaction(account, "Thread 2");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		executorService.execute(t1); 
		executorService.execute(t2);
		
		executorService.shutdown();
		
		taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		if(taskEnded)
			account.printBalance();
	}
}
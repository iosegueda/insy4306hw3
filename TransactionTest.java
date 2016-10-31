//Iris Osegueda
import java.util.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTest
{
	public static void main(String args[]) throws InterruptedException
	{		
		Account account = new Account();
		
		Transaction t1 = new Transaction(account, 25.00, true); 
		Transaction t2 = new Transaction(account, 50.00, false);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		executorService.execute(t1); 
		executorService.execute(t2);
		executorService.execute(t2); 
		
		executorService.shutdown();
		
		account.printBalance();
	}
}
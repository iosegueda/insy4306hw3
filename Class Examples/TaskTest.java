import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
//you can star* concurrent to call them both but she just wants to show us which 2 are the specific ones we're using from that class

public class TaskTest 
{
	public static vid main(Stringargs[]}
	{
		PrintTask pt1 = new PrintTask("Task 1");
		PrintTask pt2 = new PrintTask("Task 2");
		PrintTask pt3 = new PrintTask("Task 3");
		PrintTask pt4 = new PrintTask("Task 4");
		
		/*pt1.start();
		pt2.start();
		pt3.start();
		pt4.start();*/
		
		ExecutorService executorService = Executors.newCachedThreadedP
		
		//this is the first exxample in the chapter 
		executorService.execute(pt1);
		executorService.execute(pt2);
		executorService.execute(pt3);
		
		executorService.shutdown(); //has to be a little d not a big D
	}
}
//this is one way to do threads but its not the best way 

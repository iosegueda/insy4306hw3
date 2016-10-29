import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutorNumber
{
	public static void main(String[] args)
	{
		//creat and name each runnable
		PrintNumber task1 = new PrintNumber("task1");
		PrintNumber task2 = new PrintNumber("task2");
		PrintNumber task3 = new PrintNumber("task3");
		
		System.out.println("Starting Executor");
		
		//create ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadedPool();
		
		//start the three PrintTasks
		executorService.execute(task1); //start task 1
		executorService.execute(task2); //start task 2
		executorService.execute(task3); //start task 3
		
		//shut down ExecutorService-- it decides when to shut down threads 
		executorService.shutdown();
		
		//System.out.println
		

	}
}
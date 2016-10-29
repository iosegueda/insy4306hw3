import java.util.*; //remember concurrent is where our executors and threading stuff happens 
//suposed to print the count when everything is done 
//how to protect the data in mutable threads? 
//shared mutable threads - java uses monitors and you tell java which threads to monitor and only 1 thread can get the lock at a times
//when it finishes what its doing it gives the lock back to the monitor and then the monitor gives it to the next thread

public class ThreadSafety
{
	public static void main(String args[]) throws InterruptedException
	{
		boolean taskEnded;
		MyData myData = new MyData();
		
		ProcessingThread pt1 = new ProcessingThread("t1", myData);
		ProcessingThread pt2 = new ProcessingThread("t2", myData);
		
		//create ExecutorService to manage threads
		ExecutorService executorService = Executors.newCachedThreadedPool();
		
		//start the three PrintTasks
		executorService.execute(pt1); //start task 1
		executorService.execute(pt2); //start task 2
		
		//shut down ExecutorService-- it decides when to shut down threads 
		executorService.shutdown();
		
		taskEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		if(tasksEnded)
			System.out.println("Processing count = " + ProcessingThread.getcount());
		//don't play with your times too much to fit YOUR needs? 
	
		
	}
}

class ProcessingThread implements Runnable
{
	//private static int count = 0; 
	private String name;
	private MyData md;
	
	public ProcessingThread(String n, MyData m)
	{
		name = n;
		//what must everythread have? run()
		md = m;
	}
	public void run()
	{
		for(int i = 1; i < 5; i++)
		{
			processingSoemthing(i);
			md.addcount();
		}
	}
	
	private void processingSomething(int i)
	{
		try 
		{
			Thread.sleep(i*1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class MyData
{
	private int count =0;
	
	//shared data that is changing must be in its own class 
	//and must be synchronized for better accuracy
	public synchronized void addCount()
	{
		count++;
	}
	public int getcount()
	{
		return count;
	}
}

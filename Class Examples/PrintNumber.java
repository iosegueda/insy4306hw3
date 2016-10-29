public class PrintNumber implements Runnable
{
	private String taskName;
	
	//constructor
	public PrintNumber(String taskName)
	{
		this.taskName = taskName;
		
	}
	
	//method run contains the code that a thread will execute 
	public void run()
	{
		for(int = 0; i <=10; i++)
			System.out.println(taskName + " " + i);
	}
	
}//end 
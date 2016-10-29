import java.io*;
import java.util.*
//the file was like our data structure
//this works because the data doesn't change, its read only 
//this file isn't done, has a chunk missing at the bottom 

public class PrintFile implements Runnable
{
	private String taskName
	
	//constructor
	public PrintFile(String taskName)
	{
		this.taskName = taskName;
	}
	
	public void run()
	{
		//read file here
		
		String name;
		int type;
		
		Scanner input;
		
		try
		{
			input = new Scanner(new File("emp.txt"));
			while(input.hasNext())
			{
				name = name.next();
				type = Integer.parseInt(input.next();
				
				System.out.println(taskName + "" +name+ "" + type+ "")
			}
		}
		
	}
}
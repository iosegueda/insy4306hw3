import java.security.SecureRandom;

public class PrintTask implements Runnable
{
	private final static SecureRandom generator = new SecureRandom();
	
	private final int sleepTime;
	private final String taskName; 
	
}
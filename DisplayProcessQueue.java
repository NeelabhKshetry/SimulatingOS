import java.util.concurrent.TimeUnit;

public class DisplayProcessQueue extends Thread
{
	public void run()
	{
		while(true)
		{
			try 
			{
				System.out.println("The queue currently has: ");
				Process one = MainRunner.processQueue.peek();
				System.out.println(one.display());
				System.out.println(MainRunner.processQueue);
				TimeUnit.SECONDS.sleep(10);
			}
			catch (Exception e) 
			{
				System.out.println("There was error with the periodic sleep.");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					System.out.println("There was error with the periodic sleep.");
				}
			}
		}
	}
}

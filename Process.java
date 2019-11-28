//import Process.status;

public class Process 
{
	enum status
	{
		START, READY, RUNNING, BLOCKED, END
	}
	private String name;
	private status status;
	private int lifeTime;
	private int blockedTime;
	
	public Process()
	{
		this.name = "systemProcess";
		this.status = status.START;
		this.lifeTime = 120;
		this.blockedTime = 0;
	}
	
	public Process( Process p)
	{
		this.name = p.name;
		this.lifeTime = p.lifeTime;
	}
	
	public Process(String name, int life)
	{
		this.status = status.START;
		this.lifeTime = life;
		this.blockedTime = 0;
	}
	
	public boolean isEnded()
	{
		return this.lifeTime == 0;
	}
	
	public boolean isBlocked()
	{
		return this.blockedTime != 0;
	}
	
	public void run()
	{
		if (this.isEnded() != true )
			if (this.isBlocked() != true)
			{
				this.lifeTime -= 1;
			}
		if(this.isEnded() == true)
		{
			this.status = status.END;
		}
	}
	
	public status checkStatus()
	{
		return this.status;
	}
	
	public int checkLife()
	{
		return this.lifeTime;
	}
	
	public int checkBlockedTime()
	{
		return this.blockedTime;
	}
	
	public void setBlockTime(int blocktime)
	{
		this.blockedTime = blocktime;
		this.status = status.BLOCKED;
	}
	
	public void IORun()
	{
		if(this.isEnded() != true)
			if(this.isBlocked())
			{
				this.blockedTime -= 1;
			}
		if(this.isBlocked() != true)
		{
			this.status = status.READY;
		}
	}
	
	public String display()
	{
		return this.name;
	}
	
	
	
}

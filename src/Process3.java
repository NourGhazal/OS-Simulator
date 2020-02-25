
public class Process3 extends Process {
	
	public  Process3()  {
	super();
	}
	public void run() {
		SysCaller caller = getCaller();
		for(int i=0;i<301;i++)
			caller.SysCall3(""+i);
}
	
}

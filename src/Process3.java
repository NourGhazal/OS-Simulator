
public class Process3 extends Process {
	
	public  Process3(Scheduler s)  {
	super(s);
	}
	public void run() {
		setEnumState(EnumState.RUNNING);
		SysCaller caller = getCaller();
		PrintOnScreen p = new PrintOnScreen();
		p.semPrintWait(this);
		 if(this.getEnumState()==EnumState.BLOCKED)
	   		   return;
		for(int i=0;i<301;i++)
			caller.SysCall3(""+i);
		setEnumState(EnumState.FINISHED);
		p.semPrintPost();
		getListener().dispatch();
}
	
	
}

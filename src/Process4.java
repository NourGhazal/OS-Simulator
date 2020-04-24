
public class Process4 extends Process {
	public Process4(Scheduler s) {
		super(s);
	}
	
	public void run() {
		setEnumState(EnumState.RUNNING);
		SysCaller caller = getCaller();
		PrintOnScreen p = new PrintOnScreen();
		p.semPrintWait(this);
		if(this.getEnumState()==EnumState.BLOCKED)
	   		   return;
		for(int i=500;i<1001;i++)
			caller.SysCall3(""+i);
		setEnumState(EnumState.FINISHED);
		p.semPrintPost();
		getListener().dispatch();
	}
}

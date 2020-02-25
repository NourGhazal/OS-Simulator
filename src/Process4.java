
public class Process4 extends Process {
	public Process4() {
		super();
	}
	
	public void run() {
		SysCaller caller =getCaller();
		for(int i=300;i<1001;i++)
			caller.SysCall3(""+i);
	}
}

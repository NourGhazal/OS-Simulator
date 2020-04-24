import java.io.File;

public class Process5 extends Process {
	private static int c;

	public Process5(Scheduler s) {
		super(s);
		c++;
	}

	
	public void run() {
		
		try {
			setEnumState(EnumState.RUNNING);
			SysCaller caller = getCaller();
			writeInDisk w = new writeInDisk();
			TakeTextInput t = new TakeTextInput();
			w.semWriteWait(this);
			t.semTakeWait(this);
			if(this.getEnumState()==EnumState.BLOCKED)
		   		   return;
			int x = Integer.parseInt(caller.SysCall4());
			int y = Integer.parseInt(caller.SysCall4());
			String s ="";
			File z = new File(String.format("C:/Users/Ghazal/eclipse-workspace/OS_Simulator/output%2d.txt", c));
			for(int i=x;i<y;i++) {
				s =s+" "+i;
				
			}
			for(int i=y;i<x;i++) {
				 s =s+" "+i;
				
			}
			caller.SysCall2(s,String.format("C:/Users/Ghazal/eclipse-workspace/OS_Simulator/output%2d.txt",c));
			System.out.println(s);
			setEnumState(EnumState.FINISHED);
			w.semWritePost();
			t.semTakePost();
			getListener().dispatch();
		}
		catch(NumberFormatException e) {
			
			System.out.println("Please enter a number");
			run();
		}
	
		
		
	}

	
	
}

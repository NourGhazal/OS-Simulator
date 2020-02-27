import java.io.File;

public class Process5 extends Process {
	private static int c;

	public Process5() {
		super();
		c++;
	}

	
	public void run() {
		
		try {
			SysCaller caller = getCaller();
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
		}
		catch(NumberFormatException e) {
			
			System.out.println("Please enter a number");
		}
	
		
		
	}

	
	
}

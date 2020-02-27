import java.io.IOException;

public class Process2 extends Process {

	public Process2() {
			super();
			}
	public void run() {
		
		SysCaller caller = getCaller();
		String data = caller.SysCall4();
		String path = caller.SysCall4();
		caller.SysCall2(data, path);
	}
	


}

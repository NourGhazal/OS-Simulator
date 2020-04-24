import java.io.IOException;

public class Process2 extends Process {

	public Process2(Scheduler s) {
			super(s);
			}
	public void run() {
		setEnumState(EnumState.RUNNING);
		writeInDisk w = new writeInDisk();
		SysCaller caller = getCaller();
		w.semWriteWait(this);
		String data = caller.SysCall4();
		String path = caller.SysCall4();
		caller.SysCall2(data, path);
		setEnumState(EnumState.FINISHED);
		w.semWritePost();
		getListener().dispatch();
	}
	


}

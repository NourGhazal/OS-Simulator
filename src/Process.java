
public class Process extends Thread {
	private int pid;
	private EnumState enumState = (EnumState.NEW);
	
	private SysCaller caller ;
	private static int counter;
	private ProcessListener listener;
	public ProcessListener getListener() {
		return listener;
	}
	public Process(Scheduler s) {
		counter++;
		pid=counter;
		caller = new SysCaller();
		listener=s;
		setEnumState(EnumState.READY);
		}
	
	public EnumState getEnumState() {
		return enumState;
	}
	public void setEnumState(EnumState state) {
		this.enumState = state;
		if(state == EnumState.READY)
			listener.schedule(this);
		if(state == EnumState.BLOCKED)
			listener.block(this);
	}
	public int getPid() {
		return pid;
	}
	public SysCaller getCaller() {
		return caller;
	}
	

	

}

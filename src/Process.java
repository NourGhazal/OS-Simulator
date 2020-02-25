
public class Process extends Thread {
	private int pid;
	private State state = State.NEW;
	private SysCaller caller ;
	private static int counter;
	public Process() {
		counter++;
		pid=counter;
		caller = new SysCaller();
		}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getPid() {
		return pid;
	}
	public SysCaller getCaller() {
		return caller;
	}
	

	

}

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler implements ProcessListener {
	private Queue<Process> processes;
	private Queue<Process> blocked;
	private boolean runnig;
	
	
	public Queue<Process> getProcesses() {
		return processes;
	}
	public Scheduler() {
		processes=new LinkedList<>();
		blocked=new LinkedList<>();
	}
	public void start() {
		this.dispatch();
	}
	public void dispatch() {
		if(!processes.isEmpty()) {
		runnig=true;
		Process proc = processes.poll();
		proc.run();
		}
		else {
		runnig=false;
		}
	}
	public void schedule(Process proc) {
		if(blocked.contains(proc))
			blocked.remove(proc);
		processes.add(proc);
		
	}
	public boolean isRunnig() {
		return runnig;
	}
	public Queue<Process> getBlocked() {
		return blocked;
	}
	public void block(Process blocked) {
		blocked.setEnumState(EnumState.BLOCKED);
		this.blocked.add(blocked);
	}
	
	
}

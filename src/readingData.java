import java.util.ArrayList;

public class readingData extends Semaphore {
	private boolean available = true;
	private Process running = null;
	private ArrayList<Process> waiting = new ArrayList<Process>();

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Process getRunning() {
		return running;
	}

	public void setRunning(Process running) {
		this.running = running;
	}

	public ArrayList<Process> getWaiting() {
		return waiting;
	}

	public void setWaiting(ArrayList<Process> p) {
		this.waiting = p;
	}

	public void semReadWait(Process asking) {
		if (available) {
			this.running = asking;
			available = false;
		}
		else {
		waiting.add(asking);
		asking.setEnumState(EnumState.BLOCKED);
		}
	}

	public void semReadPost() {

		if (waiting.isEmpty()) {
			available = true;
			running = null;

		}
		else
		{
			running=waiting.remove(0);
			running.setEnumState(EnumState.READY);
			
		}
	}

}

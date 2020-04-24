import java.util.ArrayList;

public class writeInDisk extends Semaphore{
	boolean available = true;
	Process running = null;
	ArrayList<Process> p = new ArrayList<Process>();

	public void semWriteWait(Process asking) {
		if (available) {
			this.running = asking;
			available = false;
		} else {
			p.add(asking);
			asking.setEnumState(EnumState.BLOCKED);
		}

	}

	public void semWritePost() {

		if (p.isEmpty()) {
			available = true;
			running = null;

		}
		else
		{
			running=p.remove(0);
			running.setEnumState(EnumState.READY);
		}
	}	

}

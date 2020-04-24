import java.util.ArrayList;

public class PrintOnScreen extends Semaphore{
	boolean available = true;
	Process running = null;
	ArrayList<Process> p = new ArrayList<Process>();

	public void semPrintWait(Process pro) {
		if (available) {
			this.running = pro;
			available = false;
		} else {
			p.add(pro);
			pro.setEnumState(EnumState.BLOCKED);
		}

	}

	public void semPrintPost() {

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
